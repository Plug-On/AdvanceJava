package qn14AreaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AreaServlet extends HttpServlet  {
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        try (PrintWriter out = response.getWriter()) {
	            int a = Integer.parseInt(request.getParameter("l"));
	            int b = Integer.parseInt(request.getParameter("b"));
	            out.println("Area of Rectangle is: " + (a*b));
	        }
	    }
}
