package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;
import properties.PropertyManager;

public class RootOps extends JPanel{
	private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton ROOT2 = new JButton("Root2");
	private final JButton ROOT3 = new JButton("Root3"); 
		
	public RootOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		if(PropertyManager.getProperty("Sqrt")){
			this.add(ROOT2);
		}
		if(PropertyManager.getProperty("Root3")){
			this.add(ROOT3);
		}
	}
	
	private void setButtonListener(){
		ROOT2.addActionListener(new OneParamOpsListener("Root2"));
		ROOT3.addActionListener(new OneParamOpsListener("Root3"));
	}

}
