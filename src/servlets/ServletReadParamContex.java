package servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Santer on 30.01.2016.
 */
@WebServlet("/ServletReadParamContex")
public class ServletReadParamContex extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        ServletContext context = getServletContext();

        String maxSize = context.getInitParameter("max-shop-cart-size");
        String par2 = context.getInitParameter("parametr-2");

        writer.println("<html><body>");
        writer.println("Max size: " + maxSize);
        writer.println("<br><br>");
        writer.println("Second param is: " + par2);
        writer.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
