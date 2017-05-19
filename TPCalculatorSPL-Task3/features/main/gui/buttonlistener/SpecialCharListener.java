package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.gui.GuiController;

public class SpecialCharListener implements ActionListener{
	
	private  String character = "";
	public SpecialCharListener(String character) {
		this.character = character; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue();
		if(character.equals(".") && value.equals("")){
			value = "0"; 
		}
		GuiController.getInstance().setDisplayValue(value + character);
	}

}
