import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		JOptionPane.showMessageDialog(null, "Nome Informado: "+nome);
	}
}
