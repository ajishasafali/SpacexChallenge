package de.ajish.spacex.challenge;

import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.server.api.SpacexApiV1;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "spacexServlet", value = "/spacex-company-servlet")
public class SpacexServlet extends HttpServlet {
    private String ceo;
    private String coo;
    private String totalDragons;
    private String companySummary;

    public void init() {
        SpacexApiV1 spacexApiV1 = new SpacexApiV1();
        Company company = spacexApiV1.getSpacexCompanyInfo();
        DragonsDetails dragonsDetails = spacexApiV1.getSpacexDragonInfo();
        ceo = "CEO: "+ company.getCeo();
        coo = "COO: "+ company.getCoo();
        companySummary = company.getSummary();
        totalDragons= "Total available Dragons: "+ dragonsDetails.getDragons().size();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>" +
                "<head>" +
                "<style>" +
                "h1 {text-align: center;}" +
                "h2 {text-align: center;}" +
                "h3 {text-align: center;}" +
                "p {text-align: center;}" +
                "</style>" +
                "</head><body style='background-color:yellow;'>");
        out.println("<h1><i>SpaceX</i></h1>");
        out.println("<h2>" + ceo + "</h2>");
        out.println("<h2>" + coo + "</h2>");
        out.println("<p>" + companySummary + "</p>");
        out.println("<h3><i>" + totalDragons + "</i></h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}