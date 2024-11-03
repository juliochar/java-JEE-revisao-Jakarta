package br.juliok;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@WebServlet("/refreshHeaderExample")
public class ResponseHeaderExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ResponseHeaderExample() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//enviar ao navehador um header informando que deve atualizar a cada 5 segundos
		response.setIntHeader("Refresh", 5);
		
		response.setStatus(500);
		
		
		PrintWriter printwriter = response.getWriter();
		
		printwriter.print(new Date());
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
