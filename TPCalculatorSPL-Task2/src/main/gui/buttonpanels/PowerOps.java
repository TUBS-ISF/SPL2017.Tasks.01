package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;
import properties.PropertyManager;

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
		if(PropertyManager.getProperty("P2O")){
			this.add(POW2);
		}
		if(PropertyManager.getProperty("P3O")){
			this.add(POW3);
		}

		if(PropertyManager.getProperty("P4O")){
			this.add(POW4);
		}
	}
	
	private void setButtonListener(){
		POW2.addActionListener(new OneParamOpsListener("Pow2"));
		POW3.addActionListener(new OneParamOpsListener("Pow3"));
		POW4.addActionListener(new OneParamOpsListener("Pow4"));
	}
}
