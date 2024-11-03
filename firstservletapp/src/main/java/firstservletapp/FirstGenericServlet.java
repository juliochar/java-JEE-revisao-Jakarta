package firstservletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter printwriter = res.getWriter();
		printwriter.print("<h1>Olá Mundo do servlet Generico");
		printwriter.print("<h1>Hoje é: " + new Date() + "</h1>");
		
		
		
	}
	

}
