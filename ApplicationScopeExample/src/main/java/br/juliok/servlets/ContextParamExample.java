package br.juliok.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class ContextParamExample
 */
@WebServlet("/ContextParamExample")
public class ContextParamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    public void init(ServletConfig config) throws ServletException {
      		super.init();
      		
      		//1 - iniciar
      		config.getServletContext();
      		
      		
    }
    public ContextParamExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printwriter = response.getWriter();
		
		//Carregar os parametros definidos lá no web.xml
		ServletContext servletcontext = request.getServletContext();
				
		printwriter.print("<h2> Context Parameters </h2><br/>");
		printwriter.print("<h3> DB param: " + servletcontext.getInitParameter("dp-ip") + "</h3>");
		printwriter.print("<h3> DB port: " + servletcontext.getInitParameter("dp-port") + "</h3>");
		
		
		Enumeration<String> enumeration = servletcontext.getInitParameterNames();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
