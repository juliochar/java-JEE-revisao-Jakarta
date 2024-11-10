package br.juliok.javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.BufferedWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("In venenatis vestibulum enim sit amet tristique.");
		bw.newLine();
		bw.newLine();
		bw.write("Final Arquivo?");
		
		bw.close();
		

	}

}
