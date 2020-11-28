import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class VaronMujer extends JFrame implements ActionListener {
		private JButton hombre, mujer;
		
		public VaronMujer() {
			setLayout(null);
			
			hombre = new JButton("Hombre");
			hombre.setBounds(10,100,90,30);
			add(hombre);
			hombre.addActionListener(this);
			
			mujer = new JButton("Mujer");
			mujer.setBounds(110,100,90,30);
			add(mujer);
			mujer.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == hombre) {
				setTitle("Apreto Hombre");
			}
			if(e.getSource() == mujer) {
				setTitle("Apreto Mujer");
			}
		}
		public static void main(String[] ar) {
			VaronMujer test1 = new VaronMujer();
			test1.setBounds(0,0,350,200);
			test1.setVisible(true);
		}
		

}
