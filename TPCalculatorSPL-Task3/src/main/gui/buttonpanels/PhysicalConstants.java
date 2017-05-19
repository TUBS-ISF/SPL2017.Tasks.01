package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.SpecialValueListener;

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
				
			this.add(SOL);
			
			
				
			this.add(SOS);
			
			
				
			this.add(GC);
			
	}
	
	private void setButtonListener(){
			
		SOL.addActionListener(new SpecialValueListener("SOL"));
		
		
			
		SOS.addActionListener(new SpecialValueListener("SOS"));
		
		
			
		GC.addActionListener(new SpecialValueListener("GC"));
		
	}
}
