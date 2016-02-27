package br.com.sisnema.syslocadora.model;

public class Midia {

	private static int cont;
	public int codigo;
	public String nome;
	public String genero;

	public Midia() {
		codigo = ++cont;
		
	}

	@Override
	public String toString() {
		return "Midia [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + "]";
	}

}
