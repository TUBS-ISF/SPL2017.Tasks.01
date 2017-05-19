package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;

public class PowerOps extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
		
	private final JButton POW2 = new JButton("Pow2");	
	
	
		
	private final JButton POW3 = new JButton("Pow3");
	
	
	


		
	public PowerOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
			
		this.add(POW2);
		
			
			
		this.add(POW3);
		

		


	}
	
	private void setButtonListener(){
			
		POW2.addActionListener(new OneParamOpsListener("Pow2"));
		
		
			
		POW3.addActionListener(new OneParamOpsListener("Pow3"));
		

		


	}
}
