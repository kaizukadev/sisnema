package br.com.sisnema.syslocadora.model;

public class Filme {

	private static int cont;
	public int codigo;
	public String nome;
	public String genero;

	public Filme() {
		codigo = ++cont;
		
	}

	@Override
	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + "]";
	}

}
