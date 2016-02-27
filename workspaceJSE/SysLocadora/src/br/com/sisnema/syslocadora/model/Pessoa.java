package br.com.sisnema.syslocadora.model;

public class Pessoa {

	private static int cont;
	private int id;
	public String nome;
	public String endereco;
	
	public Pessoa() {
		id = ++cont;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	


}
