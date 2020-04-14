package br.com.joilton.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.joilton.Model.Pessoa;

public class Deserializacao {
	
	public Pessoa deserializacao() {
			
		Pessoa p = new Pessoa();
		try {
			FileInputStream fileInp = new FileInputStream("Pessoas.ser");
			ObjectInputStream in = new ObjectInputStream(fileInp);
			p = (Pessoa) in.readObject();
			in.close();
			fileInp.close();
		} catch (IOException e) {
			e.printStackTrace(); 
		}catch(ClassNotFoundException c) {
			System.out.println("Pessoa class nou found");
			c.printStackTrace();
		}
		
		
		
		
		return p;
	
	}

}
