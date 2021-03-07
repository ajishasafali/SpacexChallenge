package de.ajish.spacex.challenge;

import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.server.api.SpacexApiV1;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * SpaceX servlet used as of now only to display static info about the REST endpoints
 */
@WebServlet(name = "spacexServlet", value = "/sie-spacex-challenge-servlet")
public class SpacexServlet extends HttpServlet {
    private String baseUrlTemplate;
    private String api;
    private String version;
    private String companyInfo;
    private String dragonDetails;
    private String crewDetails;

    public void init() {
        baseUrlTemplate =  "{baseUrl}";
        api = "/api";
        version = "/v1";
        companyInfo = "/company-info";
        dragonDetails = "/dragons-details";
        crewDetails = "/crew-details";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>" +
                "<head>" +
                "<style>" +
                "h2 {text-align: center;}" +
                "h3 {text-align: center;}" +
                "p {text-align: center;}" +
                "</style>" +
                "</head><body style='background-color:lightgrey;'>");
        out.println("<h2><i>SpaceX wrapper currently available GET endpoints</i></h2>");
        out.println("<h2><i>At present, this REST service only provides 3 GET endpoints</i></h2>");
        out.println("<p>" + baseUrlTemplate + api + version + companyInfo + "<p>");
        out.println("<p>" + baseUrlTemplate + api + version + dragonDetails + "<p>");
        out.println("<p>"+ baseUrlTemplate + api + version + crewDetails + "<p>");
        out.println("<p>" + "Note: " +crewDetails + " endpoint offers a possibility to pass a query parameter 'agency'" + "</p>");
        out.println("<p>" + "Template with query parameter: " + baseUrlTemplate + api + version + crewDetails + "?agency={agency}</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}