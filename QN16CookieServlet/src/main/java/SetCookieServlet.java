

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create a cookie
        Cookie cookie = new Cookie("username", "Niraj");
        cookie.setMaxAge(60 * 60); // 1 hour
        
        // Add cookie to response
        response.addCookie(cookie);

        out.println("<html><body>");
        out.println("<h3>Cookie has been set. <a href='ReadCookieServlet'>Click here to read it</a></h3>");
        out.println("</body></html>");
    }
}
