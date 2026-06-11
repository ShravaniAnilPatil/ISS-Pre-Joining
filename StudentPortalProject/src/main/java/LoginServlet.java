

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

			    String username =
			    request.getParameter("username");

			    String password =
			    request.getParameter("password");

			    if(username.equals("admin")
			       && password.equals("1234")) {

			        response.sendRedirect("Welcome.jsp");

			    } else {

			        response.getWriter().println(
			        "Invalid Login");
			    }
			}

}
