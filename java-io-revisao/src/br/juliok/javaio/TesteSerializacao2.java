package br.juliok.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Usando a classe Cliente
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Noir");
//		cliente.setProfissao("Developer");
//		cliente.setCpf("55887799113");
//		
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		
		//leitura
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cli = (Cliente)ois.readObject();
		ois.close();
		System.out.println("Cliente nome: " + cli.getNome());
		
		
		
		
		
		
		// public interface Serializable - Marcando o objeto em um contrato formal
		//Objetos serializados, se tiverem o serialVersionID diferentes na geração da origem do arquivo ele nao conseguirá ler o arquivo
		//Modificando o serialVersion em arquivos gravados com outra marcação não irão funcionar
		//no Java ele marca no arquivo binário qdo gravamos um objeto o serialVersion e compara na hora de ler
		
		// TRANSIENT nao leva o atributo para o arquivo

	}

}
