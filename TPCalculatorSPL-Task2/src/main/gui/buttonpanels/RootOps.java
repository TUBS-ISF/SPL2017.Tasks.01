package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OperationButtonListener;

public class RootOps extends JPanel{
	private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton ROOT2 = new JButton("Root2");
	private final JButton ROOT3 = new JButton("Root3"); 
		
	public RootOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		this.add(ROOT2);
		this.add(ROOT3);
	}
	
	private void setButtonListener(){
		ROOT2.addActionListener(new OperationButtonListener("Root2"));
		ROOT3.addActionListener(new OperationButtonListener("Root3"));
	}

}
