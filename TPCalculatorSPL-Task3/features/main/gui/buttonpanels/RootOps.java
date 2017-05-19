package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;

public class RootOps extends JPanel{
	private final GridLayout GRID = new GridLayout(4, 1); 
	
	
	/*if[Sqrt]*/	
	private final JButton ROOT2 = new JButton("Root2");
	/*end[Sqrt]*/
	
	
	/*if[Root3]*/	
	private final JButton ROOT3 = new JButton("Root3");
	/*end[Root3]*/
		
	public RootOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		/*if[Sqrt]*/	
		this.add(ROOT2);
		/*end[Sqrt]*/
			
		/*if[Root3]*/	
		this.add(ROOT3);
		/*end[Root3]*/
	}
	
	private void setButtonListener(){
		/*if[Sqrt]*/	
		ROOT2.addActionListener(new OneParamOpsListener("Root2"));
		/*end[Sqrt]*/
		
		/*if[Root3]*/	
		ROOT3.addActionListener(new OneParamOpsListener("Root3"));
		/*end[Root3]*/
	}

}
