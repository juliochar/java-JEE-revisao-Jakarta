package br.juliok;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
		urlPatterns = { "/feedbackServlet" }, 
		initParams = { 
				@WebInitParam(name = "company-email", value = "jeecourse@gmail.com", description = "Organization")
		})
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String companyInitParameter = null;
      
    public FeedbackServlet() {
        super();
      
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException{
    	super.init();
    	
    	// read init param
    	companyInitParameter = config.getInitParameter("company-email");
    	
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter printwriter = response.getWriter();
		printwriter.print("<h2> Init Param value: " + companyInitParameter + "</h2>");
		
		// read feedback param
		
		String feedbackParam = request.getParameter("feedbackParam");
		
		printwriter.print("<h3> Conteúdo:  " + feedbackParam + "</h3>");
		//send an email
	}

}
