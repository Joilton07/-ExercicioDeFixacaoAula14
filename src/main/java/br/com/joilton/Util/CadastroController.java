package br.com.joilton.Util;


import br.com.joilton.Model.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroController {
	
	@FXML
	private TextField testNome;
	
	@FXML
	private TextField testCPF;
	
	@FXML
	private TextField testData;
	
	@FXML
	private TextField testNomeMae;
	
	@FXML
	private Button botao7;
	
	
	@FXML
	private void actionBotao(){
	
		
		Serializacao se = new Serializacao();
		Deserializacao de = new Deserializacao();
		Pessoa pe = new Pessoa(testNome.getText(), testCPF.getText(), testNomeMae.getText(), testData.getText());
		se.serializacao(pe);
		pe = de.deserializacao();
		
	
		System.out.println("Name: " + pe.getNome());
		System.out.println("CPF: " + pe.getCpf());
		System.out.println("Data de nascimento: " + pe.getData());
		System.out.println("Nome da Mãe: " + pe.getNomeDaMae());
		
		
	}
	
	

}
