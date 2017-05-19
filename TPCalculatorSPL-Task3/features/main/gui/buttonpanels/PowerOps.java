package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;

public class PowerOps extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
	/*if[P2O]*/	
	private final JButton POW2 = new JButton("Pow2");	
	/*end[P2O]*/
	
	/*if[P3O]*/	
	private final JButton POW3 = new JButton("Pow3");
	/*end[P3O]*/
	
	/*if[P4O]*/	
	private final JButton POW4 = new JButton("Pow4");
	/*end[P4O]*/
		
	public PowerOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		/*if[P2O]*/	
		this.add(POW2);
		/*end[P2O]*/
			
		/*if[P3O]*/	
		this.add(POW3);
		/*end[P3O]*/

		/*if[P4O]*/	
		this.add(POW4);
		/*end[P4O]*/
	}
	
	private void setButtonListener(){
		/*if[P2O]*/	
		POW2.addActionListener(new OneParamOpsListener("Pow2"));
		/*end[P2O]*/
		
		/*if[P3O]*/	
		POW3.addActionListener(new OneParamOpsListener("Pow3"));
		/*end[P3O]*/

		/*if[P4O]*/	
		POW4.addActionListener(new OneParamOpsListener("Pow4"));
		/*end[P4O]*/
	}
}
