package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.IButton;
import interfaces.IPanel;
import listener.NumberButtonListener;
import listener.SpecialCharListener;

public class BaseButtons implements IPanel{

	private JPanel panel = new JPanel(); 
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
		panel.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
		panel.add(B7);
		panel.add(B8);
		panel.add(B9);
		panel.add(EQ);
		panel.add(B4);
		panel.add(B5);
		panel.add(B6);
		panel.add(KOMMA);
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(RBR);
		panel.add(AC);
		panel.add(B0);
		panel.add(DEL);
		panel.add(LBR);
		
		LBR.setVisible(false);
		RBR.setVisible(false);
		
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
		KOMMA.addActionListener(new SpecialCharListener("."));
		
		AC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiController.getInstance().setDisplayValue("");
				GuiController.getInstance().clearCache(); 	
				GuiController.getInstance().setToggeled(false);
			}
		});
		
		DEL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiController.getInstance().setDisplayValue(""); 
				
			}
		});
		
		EQ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(GuiController.getInstance().isToggeled()){
					String value = GuiController.getInstance().getDisplayValue(); 
					GuiController.getInstance().setCache(2, value);
					GuiController.getInstance().calculate();
//					GuiController.getInstance().setCache(1, value);
					GuiController.getInstance().setToggeled(false);
				}
				else{
					GuiController.getInstance().calculate();
				}
					
			}
		});
	}

	
	@Override
	public JPanel getPanel(HashMap<String, JButton> buttMap) {
		return panel;
	}

}
