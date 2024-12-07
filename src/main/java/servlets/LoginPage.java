package servlets;

import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import userbean.UserBean;

@WebServlet("/LoginServlet")
public class LoginPage extends HttpServlet  {
    private static final long serialVersionUID = 1L;
    public LoginPage() {
        super();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        response.setContentType("text/html");

        // Initializing the user's session
        HttpSession session = request.getSession();

        // Create a new instance of UserBean
        UserBean user = new UserBean();

        // Populate the bean with request data
        user.set_first_name(request.getParameter("first_name"));
        user.set_last_name(request.getParameter("last_name"));

        // Store the bean in request scope and forward to a JSP
        request.setAttribute("user", user);
        String target = "welcome.jsp";
        request.getRequestDispatcher(target).forward(request, response);



    }

}
