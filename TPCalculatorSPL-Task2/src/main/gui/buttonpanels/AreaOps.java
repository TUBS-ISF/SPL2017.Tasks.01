package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;

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
		AOR.addActionListener(new OneParamOpsListener("AoR"));
		AOC.addActionListener(new OneParamOpsListener("AoC"));
		AOT.addActionListener(new OneParamOpsListener("AoT"));
	}

}
