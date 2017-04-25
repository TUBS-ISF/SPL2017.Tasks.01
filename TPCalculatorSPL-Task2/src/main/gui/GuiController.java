package main.gui;

import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.JFrame;

/**
 * TODO description
 */
public class GuiController {
	private JFrame mainFrame = new JFrame("tpCalcualtorSPL"); 
	private TextArea inputField = new TextArea(); 
	
	
	public GuiController(){
		mainFrame.setSize(700, 400);
		mainFrame.setPreferredSize(new Dimension(700, 400));
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	public String getInput(){
		inputField.getText(); 
		return ""; 
	}

}