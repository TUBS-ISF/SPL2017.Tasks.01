package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.gui.GuiController;

public class NumberButtonListener implements ActionListener{

	private String number = "";
	
	public NumberButtonListener(String number) {
		this.number = number; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue(); 
		value = value + number; 
		GuiController.getInstance().setDisplayValue(value);
		
	}

}
