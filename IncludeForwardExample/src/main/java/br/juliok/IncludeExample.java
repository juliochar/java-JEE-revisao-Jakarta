package br.juliok;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/IncludeExample")
public class IncludeExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public IncludeExample() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printwriter = response.getWriter();
		printwriter.write("olá - Servlet IncludeExample - <br>");
		
		
		
		ServletContext context = request.getServletContext();
		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/IncludeExample1");
		
		dispatcher.include(request, response); // diferença entre forward e include
		
		// com include o conteúdo da primeira servlet é todo executado e depois passa para a segunda
		//com forward o conteúdo anterior é apagado como feito uma nova requisição
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
