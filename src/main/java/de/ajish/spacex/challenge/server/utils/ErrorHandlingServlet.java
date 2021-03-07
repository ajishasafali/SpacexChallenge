package de.ajish.spacex.challenge.server.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * template used from https://scalified.com/2017/11/14/java-backend-handling-exceptions-jax-rs-java-servlets/
 */
@WebServlet("/error-handling-servlet")
public class ErrorHandlingServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
                         HttpServletResponse response) throws ServletException, IOException {
      int statusCode = response.getStatus();

      if (statusCode >= 200 && statusCode < 299) {
          super.service(request, response);
      } else {
          response.setContentType(MediaType.APPLICATION_JSON);
          Response.Status status = Response.Status.fromStatusCode(statusCode);

          ErrorResponse errorResponse =
		    new ErrorResponse(statusCode, status.getReasonPhrase());

          if(statusCode == 404){
              errorResponse.setMessage("Please use only the endpoints provided in documentation: https://github.com/ajishasafali/SpacexChallenge/blob/master/README.md.");
          } else{
              errorResponse.setMessage("Please contact support: ajish.asafali@gmail.com");
          }

          ObjectMapper objectMapper = new ObjectMapper();
          String entity = objectMapper.writeValueAsString(errorResponse);

          try (PrintWriter writer = response.getWriter()) {
              writer.write(entity);
              writer.flush();
          }
      }
   }
}