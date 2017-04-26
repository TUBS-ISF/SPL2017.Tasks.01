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
	
	private final JButton ADD = new JButton("+");
	private final JButton SUB = new JButton("-"); 
	private final JButton MUL = new JButton("*");
	private final JButton DIV = new JButton("/");
	
	public BaseOperation(){
		super(); 
		this.setLayout(GRID);
		initGrid(); 
		setButtonListener();
	}
	
	private void initGrid(){
		this.add(ADD);
		this.add(SUB);
		this.add(MUL);
		this.add(DIV);
	}
	
	private void setButtonListener(){
		ADD.addActionListener(new TwoParamOpsListener("ADD"));
		SUB.addActionListener(new TwoParamOpsListener("SUB"));
		MUL.addActionListener(new TwoParamOpsListener("MUL"));
		DIV.addActionListener(new TwoParamOpsListener("DIV"));
	}
	
}
