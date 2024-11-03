package br.juliok;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Servlet implementation class BinaryStreamExample
 */
@WebServlet("/showImage")
public class BinaryStreamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    
    public BinaryStreamExample() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//setar o tipo de envio
		response.setContentType("image/png"); // Mime Type
		
		
		//1 - Open Stream
		ServletOutputStream outputstream = response.getOutputStream();
		
		InputStream inputstream = getServletContext().getResourceAsStream("images/bob.png");
		
		//2- definir o byte array
		byte[] imageBytes = new byte[inputstream.available()];
		
		
		// - ler a imagem
		inputstream.read(imageBytes);
		
		
		//4 - escrever os bytes na saida do output strea,
		
		outputstream.write(imageBytes);
		outputstream.flush(); //atualizar internamente
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
