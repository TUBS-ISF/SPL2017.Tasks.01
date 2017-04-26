package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OperationButtonListener;

public class AreaOps extends JPanel{
	
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton AOR = new JButton("AOR");
	private final JButton AOC = new JButton("AOC");
	private final JButton AOT = new JButton("AOT");
		
	public AreaOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		this.add(AOR);
		this.add(AOC);
		this.add(AOT);
	}
	
	private void setButtonListener(){
		AOR.addActionListener(new OperationButtonListener("AoR"));
		AOC.addActionListener(new OperationButtonListener("AoC"));
		AOT.addActionListener(new OperationButtonListener("AoT"));
	}

}
