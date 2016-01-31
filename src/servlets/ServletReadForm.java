package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Santer on 29.01.2016.
 */
@WebServlet("/ServletReadForm")
public class ServletReadForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");

        writer.println("<h2>");
        writer.println("first Name: " + req.getParameter("firstName").toUpperCase());
        writer.println("<br>");
        writer.println("last Name: " + req.getParameter("secondName").toUpperCase());
        writer.println("</h2>");

        writer.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
