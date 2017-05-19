package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.SpecialValueListener;

public class MathConstants extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	/*if[Pi]*/	
	private final JButton PI = new JButton("PI");
	/*end[Pi]*/

	/*if[EN]*/	
	private final JButton EN = new JButton("e");
	/*end[EN]*/
		
	public MathConstants(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		/*if[Pi]*/	
		this.add(PI);
		/*end[Pi]*/
			
		/*if[EN]*/	
		this.add(EN);
		/*end[EN]*/
	}
	
	private void setButtonListener(){
		/*if[Pi]*/	
		PI.addActionListener(new SpecialValueListener("PI"));
		/*end[Pi]*/
		
		
		/*if[EN]*/	
		EN.addActionListener(new SpecialValueListener("EN"));
		/*end[EN]*/
	}
}
