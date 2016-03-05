package br.com.sisnema.syslocadora.model;

/**
 * Classe que representa as ações de tela para o programa de clientes
 * @author Administrador
 * @version 1.0
 * @since 05/03/2016
 */
public class Pessoa {

	private static int cont;
	private int id;
	public String nome;
	public String endereco;
	
	public Pessoa() {
		id = ++cont;
	}

	public Pessoa(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (!(obj instanceof Pessoa)) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
}
