package br.com.sisnema.syslocadora.model;

/**
 * Classe que representa as ações de tela para o programa de  midias
 * @author Administrador
 * @version 1.0
 * @since 05/03/2016
 *
 */

public class Midia {

	private static int cont;
	public int codigo;
	public String descricao;

	public Midia() {
		codigo = ++cont;
	}

	public Midia(int codigo) {
		super();
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Midia [codigo=" + codigo + ", descricao=" + descricao + "]";
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
		if (!(obj instanceof Midia)) {
			return false;
		}
		Midia other = (Midia) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

}
