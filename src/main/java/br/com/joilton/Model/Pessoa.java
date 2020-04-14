package br.com.joilton.Model;

public class Pessoa implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6363273048829539358L;
	public String nome;
	public String cpf;
	public String nomeDaMae;
	public String data;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf, String data, String nomeDaMae) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nomeDaMae = nomeDaMae;
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
