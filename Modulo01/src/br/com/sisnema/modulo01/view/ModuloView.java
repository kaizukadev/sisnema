package br.com.sisnema.modulo01.view;

import javax.swing.JOptionPane;

public class ModuloView {
	
	public static void main(String[] args) {
		
//		comparaValores();
		
		
	}

	public static void comparaValores(){
		int val1 = Integer.parseInt( JOptionPane.showInputDialog("Valor 1:"));
		int val2 = Integer.parseInt( JOptionPane.showInputDialog("Valor 2:"));
		
		if(val1>val2){
			JOptionPane.showMessageDialog(null,"Primeiro é maior");
			
		}else if (val1<val2){
			JOptionPane.showMessageDialog(null,"Segundo é maior");
			
		}else{
			JOptionPane.showMessageDialog(null,"Valores Iguais");
		
		}
		
		
	}
	
	
}
