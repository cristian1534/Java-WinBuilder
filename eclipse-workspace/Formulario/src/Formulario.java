
import javax.swing.*;

public class Formulario extends JFrame {

	private JLabel label1;
	
	public Formulario() {
	setLayout(null);
	label1 = new JLabel("Hola Alexis, buen Domingo en el parque!!! ");
	label1.setBounds(10,20,2000,30);
	add(label1);
}

	public static void main(String[] ar) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(10,10,400,300);
		formulario1.setVisible(true);
	}
}
