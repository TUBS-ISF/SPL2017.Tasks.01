package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.SpecialValueListener;
import properties.PropertyManager;

public class PhysicalConstants extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
	private final JButton SOL = new JButton("Light");
	private final JButton SOS = new JButton("Sound");
	private final JButton GC = new JButton("Gravi");
		
	public PhysicalConstants(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		if(PropertyManager.getProperty("SOL")){
			this.add(SOL);
		}
		if(PropertyManager.getProperty("SOS")){
			this.add(SOS);
		}

		if(PropertyManager.getProperty("GC")){
			this.add(GC);
		}
	}
	
	private void setButtonListener(){
		SOL.addActionListener(new SpecialValueListener("SOL"));
		SOS.addActionListener(new SpecialValueListener("SOS"));
		GC.addActionListener(new SpecialValueListener("GC"));
	}
}
