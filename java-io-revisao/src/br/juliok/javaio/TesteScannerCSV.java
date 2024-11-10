package br.juliok.javaio;

import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TesteScannerCSV {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc = new Scanner(new File("contas.csv"), "UTF-8");
		
		
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"),"%s - %04d-%08d, %20s: %08.2f",valor1, valor2, valor3, valor4, valor5);
			System.out.println(valorFormatado);
			//System.out.println(valor1 + " " + valor2 + " " + valor3 + " " + valor4 + " " + valor5);
			
			linhaScanner.close();
			
			
		}
		
		
		sc.close();
			
		

	}

}
