import javax.swing.*;
import java.awt.event.*;


public class Carta extends JFrame implements ActionListener {
		
	private JScrollPane scrollpanel;
	private JTextArea textarea1;
	private JButton boton1;
	
	public Carta() {
		setLayout(null);
		
		textarea1 = new JTextArea();
		
		scrollpanel = new JScrollPane(textarea1);
		scrollpanel.setBounds(10,10,300,200);
		add(scrollpanel);
		
		boton1 = new JButton("Verificar");
		boton1.setBounds(10,260,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			String texto = textarea1.getText();
			if(texto.indexOf("argentina") != -1 ) {
				setTitle("Si contiene el texto\"argentina\"");
			}else {
				setTitle("No contiene el text \"argentina\"");
			}
		}
	}
	
	public static void main(String[] ar) {
		Carta test1 = new Carta();
		
		test1.setBounds(0,0,400,380);
		test1.setVisible(true);
	}
}
