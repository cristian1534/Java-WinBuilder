
import javax.swing.*;
import java.awt.event.*;


public class Boton extends JFrame implements ActionListener{
	
		JButton boton1;
		
		public Boton() {
			setLayout(null);
			boton1 = new JButton("Finalizar");
			boton1.setBounds(300,250,100,30);
			add(boton1);
			boton1.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e ) {
			if(e.getSource() == boton1) {
				System.exit(0);
			}
		}
		
		public static void main(String[] ar) {
			Boton boton1 = new Boton();
			boton1.setBounds(0,0,450,350);
			boton1.setVisible(true);
		}

}
