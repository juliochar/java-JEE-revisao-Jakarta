package br.juliok.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HTTPServletRequestExample
 */
@WebServlet("/testRequest")
public class HTTPServletRequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HTTPServletRequestExample() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter printwriter = response.getWriter();
		
		// Request Object content: http request object wich sent from we browser: HEADER + Body(parameters)
		// 1 - Locale - Language ==> Response depend on the locale
		printwriter.print("<h1> reauest locale: " + request.getLocale() + "</h1>");
		
		
		//2 - content Length:
		printwriter.print("<h1>Request content Length:" + request.getContentLength() + "</h1>");
		
		
		//3 - Server Name:
		printwriter.print("<h1>Request Server name:" + request.getServerName() + "</h1>");
		
		//4 - Content Type(mime type)
		printwriter.print("<h1>Request Content type: " + request.getContentType() + "</h1>");
		
		//5 - Context Path
		printwriter.print("<h1>Request Request content Path : " + request.getContextPath() + "</h1>");
		
		
		//6 - parameter (request body)
		
		printwriter.print("<h1>Request Parameter: " + request.getParameter("userName") + "</h1>");
		printwriter.print("<h1>Country Parameter: " + request.getParameter("country") + "</h1>");
		
		
		
		printwriter.print("<h1>Get parameters name " + request.getParameterNames() + "</h1>");
		
		printwriter.print("<h1>Get header:  " + request.getHeader("") + "</h1>");
		
		printwriter.print("<h1>Get header Names " + request.getHeaderNames() + "</h1>");
		
		
	}

}
