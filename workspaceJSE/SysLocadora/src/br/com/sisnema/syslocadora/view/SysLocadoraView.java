package br.com.sisnema.syslocadora.view;

import javax.swing.JOptionPane;

public class SysLocadoraView {
	
	public static void main(String[] args) {

		String opc = JOptionPane.showInputDialog(getMenu());
		
		PessoaView.run();
	
	
	}
	
	// - 3.1.2 - Crie um método de classe (getMenu) que retorne uma string:
	private static String getMenu(){
		return "MENU PRINCIPAL\n"
				+ "----------------------\n"
				+ "1 - Clientes\n"
				+ "2 - Filmes\n"
				+ "3 - Midias\n"
				+ "0 - Sair\n";
	}


}
