package br.juliok.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		String nome = "Bob Spencer";
		
		//Transformar em fluxo de bytes
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		oos.writeObject(nome);
		oos.close();
		
		
		//leitura
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		
		String nome2 = (String) ois.readObject();
						
		ois.close();
		
		System.out.println("Leitura: " + nome2);
		
		
		
		

	}

}
