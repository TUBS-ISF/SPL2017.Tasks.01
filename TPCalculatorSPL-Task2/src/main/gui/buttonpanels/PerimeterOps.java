package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;
import properties.PropertyManager;

public class PerimeterOps extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton POR = new JButton("POR");
	private final JButton POC = new JButton("POC");
	private final JButton POT = new JButton("POT");
		
	public PerimeterOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		if(PropertyManager.getProperty("PoR")){
			this.add(POR);
		}
		if(PropertyManager.getProperty("PoC")){
			this.add(POC);
		}

		if(PropertyManager.getProperty("PoT")){
			this.add(POT);
		}
	}
	
	private void setButtonListener(){
		POR.addActionListener(new OneParamOpsListener("PoR"));
		POC.addActionListener(new OneParamOpsListener("PoC"));
		POT.addActionListener(new OneParamOpsListener("PoT"));
	}

}
