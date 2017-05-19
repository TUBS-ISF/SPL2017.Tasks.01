package main.gui.buttonpanels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.TwoParamOpsListener;

public class BaseOperation extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -123177671165161407L;

	private final GridLayout GRID = new GridLayout(4, 1); 
	
	/*if[ADD]*/
	private final JButton ADD = new JButton("+");
	/*end[ADD]*/

	/*if[SUB]*/
	private final JButton SUB = new JButton("-"); 
	/*end[SUB]*/
	
	/*if[MUL]*/
	private final JButton MUL = new JButton("*");
	/*end[MUL]*/
	
	/*if[DIV]*/	
	private final JButton DIV = new JButton("/");
	/*end[DIV]*/
	
	
	public BaseOperation(){
		super(); 
		this.setLayout(GRID);
		initGrid(); 
		setButtonListener();
	}
	
	private void initGrid(){
		/*if[ADD]*/	
		this.add(ADD);
		/*end[ADD]*/
			
		/*if[SUB]*/	
		this.add(SUB);
		/*end[SUB]*/

		/*if[MUL]*/	
		this.add(MUL);
		/*end[MUL]*/
			
		/*if[DIV]*/	
		this.add(DIV);
		/*end[DIV]*/
	}
	
	private void setButtonListener(){
		/*if[ADD]*/	
		ADD.addActionListener(new TwoParamOpsListener("ADD"));
		/*end[ADD]*/
		
		/*if[SUB]*/	
		SUB.addActionListener(new TwoParamOpsListener("SUB"));
		/*end[SUB]*/
		
		/*if[MUL]*/	
		MUL.addActionListener(new TwoParamOpsListener("MUL"));
		/*end[MUL]*/
		
		/*if[DIV]*/	
		DIV.addActionListener(new TwoParamOpsListener("DIV"));
		/*end[DIV]*/
	}
	
}
