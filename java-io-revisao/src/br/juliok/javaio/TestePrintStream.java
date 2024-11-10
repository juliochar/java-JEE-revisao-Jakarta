package br.juliok.javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;
import java.io.PrintWriter;

public class TestePrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream(new File("lorem4.txt"));
		
		ps.println("Primeira linha....");
		
		ps.println("segunda linha....");
		
		
		
		
		
		ps.close();
		
		
		
		//PrintWriter
		
		PrintWriter p2 = new PrintWriter("lorem5.txt");
		
		p2.println("imprimindo com printwriter");
		
		p2.println("Segunda linha... printwriter");
		
		p2.println("terceira linha com printwriter");
		
		
		p2.close();
				
		

	}

}
