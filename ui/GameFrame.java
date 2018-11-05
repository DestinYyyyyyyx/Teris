package ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GameFrame extends JFrame{
	public GameFrame() {
		super();
		// TODO Auto-generated constructor stub
		this.setTitle("Teris");
		this.setVisible(true);
		this.setSize(500, 300);
		//this.setIconImage(image);
		this.setResizable(false);
		this.setLocation(100, 200);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		

		
	}
	
	
}
