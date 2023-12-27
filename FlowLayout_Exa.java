package firstproject;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class FlowLayout_Exa extends JFrame 
{ 
	JLabel l1, l2, l3, l4, l5;
	public FlowLayout_Exa() 
	{ 
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		l1 = new JLabel("India "); 
		l2 = new JLabel("Pakistan ");  
		l3 = new JLabel("China ");  
		l4 = new JLabel("Japan ");
		l5 = new JLabel("Malyasia "); 
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.addWindowListener(new WindowAdapter()
		{
	        	public void windowClosing(WindowEvent we) 
	        	{
	        		System.exit(0);
	       		}
	    });
	}  
	public static void main(String[] args) 
	{ 
		FlowLayout_Exa f = new FlowLayout_Exa();
		f.setTitle("COUNTRIES");
		f.setBounds(200, 100, 600, 400); 
		f.setVisible(true); 
	} 
} 