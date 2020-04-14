package br.com.joilton.Util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.joilton.Model.Pessoa; 

public class Serializacao {
	
	public void serializacao(Pessoa p) {
		try {
			FileOutputStream fileOut = new FileOutputStream("Pessoas.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
