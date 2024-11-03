package br.juliok.servlets.sessiontracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		PrintWriter printwriter = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println("UserName: " + userName);
		System.out.println("password: " + password);
		
		
		printwriter.write("userName: " + userName);
		printwriter.write(" password: " + password);
		
		
		
		//Auth user => DB or LDAP
		
		
		Cookie userNameCookie = new Cookie("userName", userName);
		Cookie passwordCookie = new Cookie("password", password);
		
		
		
		response.addCookie(userNameCookie);
		response.addCookie(passwordCookie);
		
		printwriter.print("<br> <a href='/displayCookesServlet'> Display Cookies </a>");
		
		
		
		
	}

}
