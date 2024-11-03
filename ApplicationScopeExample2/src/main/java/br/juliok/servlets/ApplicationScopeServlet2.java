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
import java.sql.Connection;


@WebServlet("/ApplicationScopeServlet2")
public class ApplicationScopeServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	ServletContext servletContext;
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		servletContext = config.getServletContext();
	}


	public ApplicationScopeServlet2() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter printwriter = response.getWriter();
		
		Connection connection = (Connection)servletContext.getAttribute("db-connection");
		
		
		printwriter.println("Employee DB Object foi obtido: " + connection);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
