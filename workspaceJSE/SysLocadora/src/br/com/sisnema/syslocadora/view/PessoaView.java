package br.com.sisnema.syslocadora.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.sisnema.syslocadora.model.Pessoa;

public class PessoaView {

	public static void run(ArrayList<Pessoa> clientes) {
		
	int opc;
	do {

		opc = Integer.parseInt( JOptionPane.showInputDialog(getMenu()));
		
		switch (opc) {
			case 0: break;
			case 1: 
				clientes.add(cadastrar());
				break;
			case 2:
				alterar(clientes);
				break;
			case 3:
				excluir(clientes);
				break;
			case 4: 
				listar(clientes);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
		}
	} while(opc!=0);	
	
	}
	
	private static void alterar(ArrayList<Pessoa> clientes) {
		Pessoa p = new Pessoa(Integer.valueOf(JOptionPane.showInputDialog("Informe Id do Cliente")));
		
		int index = clientes.indexOf(p);
		
		if(index >=0){
			p = clientes.get(index);
			p.nome =JOptionPane.showInputDialog("Editando Nome", p.nome);
			p.endereco =JOptionPane.showInputDialog("Editando Endereço", p.endereco);
		} else {
			JOptionPane.showMessageDialog(null, "Cliente não localizado");
		}

	}

	private static void excluir(ArrayList<Pessoa> clientes) {
		Pessoa p = new Pessoa(Integer.valueOf(JOptionPane.showInputDialog("Informe Id do Cliente")));
		if (clientes.remove(p)){
			JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
		} else{
			JOptionPane.showMessageDialog(null, "Cliente não localizado");
			
		}
	}

	private static void listar(ArrayList<Pessoa> clientes) {
		
// for each
		
		for (Pessoa pessoa : clientes) {
			JOptionPane.showMessageDialog(null,pessoa);
			
		}
		
	}

	public static Pessoa cadastrar() {
		Pessoa p = new Pessoa();
		p.nome = JOptionPane.showInputDialog("Informe  Nome:");
		p.endereco = JOptionPane.showInputDialog("Informe  Endereço:");
		return p;
	}
	private static String getMenu(){
		return "MENU CLIENTES\n"
				+ "-----------------------\n"
				+ "1 - Cadastrar\n"
				+ "2 - Alterar\n"
				+ "3 - Excluir\n"
				+ "4 - Listar\n"
				+ "0 - Voltar\n";
	}
	
}
