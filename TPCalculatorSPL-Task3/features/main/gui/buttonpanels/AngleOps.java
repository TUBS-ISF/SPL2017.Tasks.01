package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.OneParamOpsListener;

public class AngleOps extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	

/*if[Sin]*/	
private final JButton SIN = new JButton("sin");
/*end[Sin]*/
/*if[Cos]*/	
private final JButton COS = new JButton("cos");
/*end[Cos]*/
/*if[Tan]*/	
private final JButton TAN = new JButton("tan");
/*end[Tan]*/
		
	public AngleOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
//		if(PropertyManager.getProperty("Sin")){
//			this.add(SIN);
//		}
			/*if[Sin]*/	
			this.add(SIN);
			/*end[Sin]*/
			
//		if(PropertyManager.getProperty("Cos")){
//			this.add(COS);
//		}
			/*if[Cos]*/	
			this.add(COS);
			/*end[Cos]*/

//		if(PropertyManager.getProperty("Tan")){
//			this.add(TAN);
//		}
			/*if[Tan]*/	
			this.add(TAN);
			/*end[Tan]*/
	}
	
	private void setButtonListener(){
		/*if[Tan]*/	
		SIN.addActionListener(new OneParamOpsListener("SIN"));
		/*end[Tan]*/
		/*if[Tan]*/	
		COS.addActionListener(new OneParamOpsListener("COS"));
		/*end[Tan]*/
		/*if[Tan]*/	
		TAN.addActionListener(new OneParamOpsListener("TAN"));
		/*end[Tan]*/
	}
}
