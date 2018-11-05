package ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GamePanel extends JPanel {

	public GamePanel() {
		super();
		// TODO Auto-generated constructor stub
		JButton jb1,jb2,jb3,jb4,jb5,jb6;
		JPanel jp1,jp2;
		jb1=new JButton("Î÷¹Ï");
		jb2=new JButton("Æ»¹û");
		jb3=new JButton("Ïã½¶");
		jb4=new JButton("ÀóÖ¦");
		jb5=new JButton("ÆÏÌÑ");
		jb6=new JButton("½Û×Ó");
		
		jp1=new JPanel();
		jp2=new JPanel();
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb3);
	}


	

}
