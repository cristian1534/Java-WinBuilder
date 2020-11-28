

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;









public class Parcial extends JFrame  implements ItemListener, ChangeListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField details;
	
	private JButton calculator, dialogue,exit;
	private JComboBox options;
	private ButtonGroup bg, bgx;
	private JRadioButton asus, gigaByte, msi,mb2, mb4, mb8 ;
	private JCheckBox monitor, hardDisk;
	
	static int intel, atlon, turion, total, placaMadre, mem, motherBoard, extra, subtotal;
	static String micro;

	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the frame.
	 */
	public Parcial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 313);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/**
		 * Options
		 */
		
		
		JLabel lblNewLabel = new JLabel("Tipo de");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(103, 52, 70, 14);
		contentPane.add(lblNewLabel);
		
		
		options = new JComboBox();
		options.setBounds(226, 50, 70, 20);
		contentPane.add(options);
		options.addItem("Intel");
		options.addItem("Atlon");
		options.addItem("Turion");
		options.addItemListener(this);
		
		
		
		
		/**
		 * Radius bg
		 */
		
		
		bg = new ButtonGroup();
		
		asus = new JRadioButton("Asus");
		asus.setBackground(SystemColor.activeCaption);
		asus.setBounds(103, 96, 57, 23);
		asus.addChangeListener(this);
		contentPane.add(asus);
		bg.add(asus);
		
		gigaByte = new JRadioButton("GigaByte");
		gigaByte.setBackground(SystemColor.activeCaption);
		gigaByte.setBounds(209, 96, 78, 23);
		gigaByte.addChangeListener(this);
		contentPane.add(gigaByte);
		bg.add(gigaByte);
		
		msi = new JRadioButton("Msi");
		msi.setBackground(SystemColor.activeCaption);
		msi.setBounds(313, 96, 62, 23);
		msi.addChangeListener(this);
		contentPane.add(msi);
		bg.add(msi);
		
		
		
		/**
		 * Radius bgx
		 */
		
		
		bgx = new ButtonGroup();
		
		
		mb2 = new JRadioButton("2 Mb");
		mb2.setBackground(SystemColor.activeCaption);
		mb2.setBounds(103, 122, 57, 23);
		mb2.addChangeListener(this);
		contentPane.add(mb2);
		bgx.add(mb2);
		
		mb4 = new JRadioButton("4 Mb");
		mb4.setBackground(SystemColor.activeCaption);
		mb4.setBounds(209, 122, 78, 23);
		mb4.addChangeListener(this);
		contentPane.add(mb4);
		bgx.add(mb4);
		
		mb8 = new JRadioButton("8 Mb");
		mb8.setBackground(SystemColor.activeCaption);
		mb8.setBounds(313, 122, 109, 23);
		mb8.addChangeListener(this);
		contentPane.add(mb8);
		bgx.add(mb8);
		
		
		
		/**
		 * CheckBox
		 */
		
		
		monitor = new JCheckBox("Monitor");
		monitor.setBackground(SystemColor.activeCaption);
		monitor.setBounds(103, 148, 97, 23);
		monitor.addChangeListener(this);
		contentPane.add(monitor);
		
		hardDisk = new JCheckBox("Disco fIjo 1 TM");
		hardDisk.setBackground(SystemColor.activeCaption);
		hardDisk.setBounds(209, 148, 97, 23);
		hardDisk.addChangeListener(this);
		contentPane.add(hardDisk);
		
		
		/**
		 * Buttons
		 */
		
		calculator = new JButton("Calcular Importe");
		calculator.setFont(new Font("Tahoma", Font.PLAIN, 10));
		calculator.setBounds(84, 189, 109, 23);
		contentPane.add(calculator);
		calculator.addActionListener(this);
		
		dialogue = new JButton("Ver Dialogo");
		dialogue.setBounds(84, 227, 109, 23);
		contentPane.add(dialogue);
		dialogue.addActionListener(this);
		
		exit = new JButton("Salir");
		exit.setBounds(226, 227, 109, 23);
		contentPane.add(exit);
		exit.addActionListener(this);
		
		details = new JTextField();
		details.setBounds(229, 190, 106, 20);
		contentPane.add(details);
		details.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Placa Madre");
		lblNewLabel_1.setBounds(26, 100, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Memoria");
		lblNewLabel_2.setBounds(26, 126, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		

		/**
		 * Text
		 */
		
		JTextPane txtpnVentaDePc = new JTextPane();
		txtpnVentaDePc.setBackground(SystemColor.textHighlight);
		txtpnVentaDePc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnVentaDePc.setText("                        Venta de PC");
		txtpnVentaDePc.setBounds(0, 0, 395, 39);
		contentPane.add(txtpnVentaDePc);
	}



	
	
	public void itemStateChanged(ItemEvent e) {
		 
		/**
		 * OPTIONS
		 */
		
		total =0;
		intel = 150;
		atlon = 80;
		turion = 120;
		
		if(e.getSource()== options) {												
			String selected = options.getSelectedItem().toString();
			
			
			if(selected == "Intel"){
				total += intel;
			};
			if(selected == "Atlon"){
				 total += atlon;
			};
			if(selected == "Turion"){
				total+= turion;
			}
			
			
			
			/**
			switch(selected){
			
			case "Intel" :  total += intel;
			break;
			
			case "Atlon" : total += atlon;
			break;
			
			case "Turion" :  total+= turion;
			break;
			
			}
			**/
			
				micro = selected;
				
		}
	
	}

	
	
	public void stateChanged(ChangeEvent e) {
		/**
		 * RADIUX
		 */
		
		
		 motherBoard =0; 
		
		if(asus.isSelected()) {
			motherBoard += 75;
		};
		if(gigaByte.isSelected()) {
			motherBoard += 320;
		};
		if(msi.isSelected()) {
			motherBoard += 100;
		};
		
		
		 mem =0; 
			
		if(mb2.isSelected()) {
			 mem += 75;
		};
		if(mb4.isSelected()) {
			 mem += 320;
		};
		if(mb8.isSelected()) {
			 mem += 100;
		};
			
				
		/**
		 * CHECK BOX
		 */
		extra =0;
		
		if(monitor.isSelected() == true) {
			extra  += 250;
		};
		if(hardDisk.isSelected() == true) {
			extra += 80;
		};
		
	}
	
	
	/**
	 * BUTTONS
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==calculator) {
			
			subtotal =0;
			subtotal = total + mem+ motherBoard + extra;
			
			DecimalFormat amount = new DecimalFormat("#.00");
			details.setText(String.valueOf(amount.format(subtotal)));
			
		}
		if(e.getSource()==dialogue) {
			
			
			DialogoVenta dc = new DialogoVenta();
			dc.setBounds(250,460,500,300);
			dc.setTitle("Detalle de Compra");
			dc.setVisible(true);
				
			
		}
		
		if(e.getSource()==exit) {
			System.exit(0);
		}
				
		
	}
	
	/**
	 * DIALOGUE
	 */
	
	public class DialogoVenta extends JDialog  implements ActionListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JLabel label1;
		JLabel label2;
		JTextField textfield1;
	    JTextField textfield2;
		JButton button1;
		
		DialogoVenta(){
			 setModal(true);
			 setResizable(false);
			 setLayout(null);
			 
			 label1 = new JLabel("Micro seleccionado: 		   "  + micro);
			 label1.setBounds(40,64,250,20);
			 label2 = new JLabel("Importe a abonar: 		u$d " + subtotal);
			 label2.setBounds(40,104,250,20);
			 
			
			 button1 = new JButton("Confirmar");
			 button1.setBounds(280,136,112,24);
			 button1.addActionListener(this);
			 
			 add(label1);
			 add(label2);
			 add(button1);
		}
		
		
		public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1) {
			
			System.exit(0);
		}
			
			
	 }	
		
}


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parcial frame = new Parcial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
	