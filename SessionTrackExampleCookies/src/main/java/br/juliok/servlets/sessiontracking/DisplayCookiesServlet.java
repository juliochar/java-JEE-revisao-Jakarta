package br.juliok.servlets.sessiontracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/displayCookiesServlet")
public class DisplayCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DisplayCookiesServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter printwriter = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		for(int i=0; i< cookies.length; i++) {
			printwriter.print("Cookie " + (i+1) + " : Name: " + cookies[i].getName() + " , value: " + cookies[i].getValue() + "\n" );
			
		}
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
