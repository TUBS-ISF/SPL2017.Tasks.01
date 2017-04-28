package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.SpecialValueListener;
import properties.PropertyManager;

public class MathConstants extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton PI = new JButton("PI");
	private final JButton EN = new JButton("e");
		
	public MathConstants(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		if(PropertyManager.getProperty("Pi")){
			this.add(PI);
		}
		if(PropertyManager.getProperty("EN")){
			this.add(EN);
		}
	}
	
	private void setButtonListener(){
		PI.addActionListener(new SpecialValueListener("PI"));
		EN.addActionListener(new SpecialValueListener("EN"));
	}
}
