package main.gui.buttonpanels;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.gui.buttonlistener.NumberButtonListener;
import main.gui.buttonlistener.SpecialCharListener;

public class BaseButtons extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8495514575608351761L;

	private GridLayout GRID = new GridLayout(4, 4);
	
	private final JButton B0 = new JButton("0");
	private final JButton B1 = new JButton("1");
	private final JButton B2 = new JButton("2");
	private final JButton B3 = new JButton("3");
	private final JButton B4 = new JButton("4");
	private final JButton B5 = new JButton("5");
	private final JButton B6 = new JButton("6");
	private final JButton B7 = new JButton("7");
	private final JButton B8 = new JButton("8");
	private final JButton B9 = new JButton("9");
	private final JButton DEL = new JButton("DEL");
	private final JButton AC = new JButton("AC");
	private final JButton LBR = new JButton("(");
	private final JButton RBR = new JButton(")");
	private final JButton EQ = new JButton("=");
	private final JButton KOMMA = new JButton(",");
	
	
	
	public BaseButtons(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		this.add(B7);
		this.add(B8);
		this.add(B9);
		this.add(RBR);
		this.add(B4);
		this.add(B5);
		this.add(B6);
		this.add(LBR);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(KOMMA);
		this.add(AC);
		this.add(B0);
		this.add(DEL);
		this.add(EQ);
		
		
	}
	
	private void setButtonListener(){
		B0.addActionListener(new NumberButtonListener("0"));
		B1.addActionListener(new NumberButtonListener("1"));
		B2.addActionListener(new NumberButtonListener("2"));
		B3.addActionListener(new NumberButtonListener("3"));
		B4.addActionListener(new NumberButtonListener("4"));
		B5.addActionListener(new NumberButtonListener("5"));
		B6.addActionListener(new NumberButtonListener("6"));
		B7.addActionListener(new NumberButtonListener("7"));
		B8.addActionListener(new NumberButtonListener("8"));
		B9.addActionListener(new NumberButtonListener("9"));
		
		RBR.addActionListener(new SpecialCharListener(")"));
		LBR.addActionListener(new SpecialCharListener("("));
		KOMMA.addActionListener(new SpecialCharListener(","));
		
		AC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello AC Button");
				
			}
		});
		
		DEL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello DEL Button");
				
			}
		});
		
		EQ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello EQ Button");
				
			}
		});
	}
	
}
