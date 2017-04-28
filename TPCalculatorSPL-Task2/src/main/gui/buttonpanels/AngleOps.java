package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;
import properties.PropertyManager;

public class AngleOps extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton SIN = new JButton("sin");
	private final JButton COS = new JButton("cos");
	private final JButton TAN = new JButton("tan");
		
	public AngleOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		if(PropertyManager.getProperty("Sin")){
			this.add(SIN);
		}
		if(PropertyManager.getProperty("Cos")){
			this.add(COS);
		}

		if(PropertyManager.getProperty("Tan")){
			this.add(TAN);
		}
	}
	
	private void setButtonListener(){
		SIN.addActionListener(new OneParamOpsListener("SIN"));
		COS.addActionListener(new OneParamOpsListener("COS"));
		TAN.addActionListener(new OneParamOpsListener("TAN"));
	}
}
