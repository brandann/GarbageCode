import java.awt.*; //import normal applet classes 
import java.awt.event.*; //import event listeners 
import javax.swing.*; //import swing components 
import javax.swing.JApplet; //import swing applet interface 
 
public class WhatEver extends JApplet 
	 implements ActionListener { 
	 
	 public void init() { //initiallize the applet 
		 getContentPane().add(label1, BorderLayout.NORTH); 
		 pane1.setLayout(new GridLayout(1,2)); 
		 pane1.add(but1); 
		 pane1.add(but2); 
		 getContentPane().add(pane1, BorderLayout.SOUTH); 
		 but1.addActionListener(this); 
		 but2.addActionListener(this); 
	 } 
	 
	 public void actionPerformed(ActionEvent event) { 
		 Object source = event.getSource(); 
		 if(source == but1) 
		 label1.setVisible(true); 
		 else //if source == but2 
		 label1.setVisible(false); 
	 } 
	 
	 private JLabel label1 = new JLabel("Hello Java Swing World"); 
	 private JPanel pane1 = new JPanel(); 
	 private JButton but1 = new JButton("ON"); 
	 private JButton but2 = new JButton ("OFF"); 
} 
