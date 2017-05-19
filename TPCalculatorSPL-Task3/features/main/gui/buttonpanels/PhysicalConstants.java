package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.SpecialValueListener;

public class PhysicalConstants extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
	/*if[SOL]*/	
	private final JButton SOL = new JButton("Light");
	/*end[SOL]*/
	
	/*if[SOS]*/	
	private final JButton SOS = new JButton("Sound");
	/*end[SOS]*/
	
	/*if[GC]*/	
	private final JButton GC = new JButton("Gravi");
	/*end[GC]*/
		
	public PhysicalConstants(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
			/*if[SOL]*/	
			this.add(SOL);
			/*end[SOL]*/
			
			/*if[SOS]*/	
			this.add(SOS);
			/*end[SOS]*/
			
			/*if[GC]*/	
			this.add(GC);
			/*end[GC]*/
	}
	
	private void setButtonListener(){
		/*if[SOL]*/	
		SOL.addActionListener(new SpecialValueListener("SOL"));
		/*end[SOL]*/
		
		/*if[SOS]*/	
		SOS.addActionListener(new SpecialValueListener("SOS"));
		/*end[SOS]*/
		
		/*if[GC]*/	
		GC.addActionListener(new SpecialValueListener("GC"));
		/*end[GC]*/
	}
}
