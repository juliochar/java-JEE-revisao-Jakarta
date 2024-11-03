package br.juliok.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SessionScopeExample
 */
@WebServlet("/isVisited")
public class SessionScopeExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionScopeExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printwriter = response.getWriter();
		
		HttpSession httpsession = request.getSession();
		
		Object sessionObj = httpsession.getAttribute("isVisited");
		if(sessionObj == null) {
			httpsession.setAttribute("isVisited", true); // adicionar atributo // server-side
			
			printwriter.print("bem vindo. ");
		}
		else {
			printwriter.print("Visitado já definido, atributo httpsession definido "); // httpsession funciona para cada cliente por um determinado período para cada janela do browser aberta
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
