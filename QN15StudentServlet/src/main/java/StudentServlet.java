

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        out.println("<html><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p><strong>ID:</strong> " + id + "</p>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");
        out.println("</body></html>");
    }
}
