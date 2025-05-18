

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReadCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String username = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    username = c.getValue();
                    break;
                }
            }
        }

        out.println("<html><body>");
        if (username != null) {
            out.println("<h3>Welcome, " + username + "</h3>");
        } else {
            out.println("<h3>No cookie found!</h3>");
        }
        out.println("</body></html>");
    }
}
