package br.juliok.javaio;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("lorem3.txt"); // é uma classe que empacota as funcionalidades do outputstream e writer
		
		fw.write("Gravando com FileWriter....");
		fw.write("segunda linha \n");
		fw.write("\n nova linha");
		
		fw.close();
		
		
		

	}

}
