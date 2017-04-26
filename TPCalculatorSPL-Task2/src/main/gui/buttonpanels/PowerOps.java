package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OperationButtonListener;

public class PowerOps extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton POW2 = new JButton("Pow2");
	private final JButton POW3 = new JButton("Pow3");
	private final JButton POW4 = new JButton("Pow4");
		
	public PowerOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		this.add(POW2);
		this.add(POW3);
		this.add(POW4);
	}
	
	private void setButtonListener(){
		POW2.addActionListener(new OperationButtonListener("Pow2"));
		POW3.addActionListener(new OperationButtonListener("Pow3"));
		POW4.addActionListener(new OperationButtonListener("Pow4"));
	}
}
