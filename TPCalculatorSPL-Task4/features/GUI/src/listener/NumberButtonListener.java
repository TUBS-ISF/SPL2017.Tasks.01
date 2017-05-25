package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.GuiController;

public class NumberButtonListener implements ActionListener{

	private String number = "";
	
	public NumberButtonListener(String number) {
		this.number = number; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue(); 
		if(!GuiController.getInstance().isNewNumber()){
			value = value + number;
		}
		else{
			GuiController.getInstance().setCache(1, GuiController.getInstance().getDisplayValue());
			GuiController.getInstance().setNewNumber(false);
			value = number;
		}
		GuiController.getInstance().setDisplayValue(value);
		
	}

}
