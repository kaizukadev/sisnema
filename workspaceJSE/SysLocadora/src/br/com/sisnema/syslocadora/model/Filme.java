package br.com.sisnema.syslocadora.model;

/**
 * Classe que representa as ações de tela para o programa de filmes
 * @author Administrador
 * @version 1.0
 * @since 05/03/2016
 *
 */

public class Filme {

	private static int cont;
	public int codigo;
	public String nome;
	public String genero;

	public Filme() {
		codigo = ++cont;
	}
	
	public Filme(int codigo) {
		super();
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Filme)) {
			return false;
		}
		Filme other = (Filme) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

}
