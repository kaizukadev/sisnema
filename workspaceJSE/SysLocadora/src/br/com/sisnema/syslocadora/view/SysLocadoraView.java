package br.com.sisnema.syslocadora.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.sisnema.syslocadora.model.Pessoa;

public class SysLocadoraView {
	
	public static void main(String[] args) {
				
		int opc = -1;
				
		ArrayList<Pessoa> clientes = new ArrayList<>();


		do {
	
				opc = Integer.parseInt( JOptionPane.showInputDialog(getMenu()));
				
				switch (opc) {
					case 0: 
						int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?",
								"",JOptionPane.YES_NO_OPTION);
						if(sair ==JOptionPane.NO_OPTION){
							opc = -1;
				
						}
						break;
					case 1: PessoaView.run(clientes);break;
					case 2: 
					case 3: 
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
				}
			} while(opc!=0);	
	
	
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
