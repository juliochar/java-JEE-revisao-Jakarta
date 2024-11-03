package firstservletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Httpservlet podemos trabalhar com DoGet e DoPost e os outros verbos http
public class FirstHttpServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		
//		PrintWriter printwriter = res.getWriter();
//		printwriter.print("<h1>Olá Mundo do servlet Http - usando 'service'");
//		printwriter.print("<h1>Hoje é: " + new Date() + "</h1>");
//		
//	
//	}
	
	//Quando usar doGet e DoPost -> utilizar HttpServletResquest e HttpServletresponse
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter printwriter = res.getWriter();
		printwriter.print("<h1>Olá Mundo do servlet Http - usando 'Get'");
		printwriter.print("<h1>Hoje é: " + new Date() + "</h1>");
		
	
	}
	

}
