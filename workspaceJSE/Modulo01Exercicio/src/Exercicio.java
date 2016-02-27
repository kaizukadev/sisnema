import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe  Nome:");
		String sexo = JOptionPane.showInputDialog("Informe  Sexo:");
		String idade = JOptionPane.showInputDialog("Informe  Idade:");
		JOptionPane.showMessageDialog(null, "Nome: "+nome);
		JOptionPane.showMessageDialog(null, "Sexo: "+sexo);
		JOptionPane.showMessageDialog(null, "Idade: "+idade);
		
		
		
		
		
	}
}
