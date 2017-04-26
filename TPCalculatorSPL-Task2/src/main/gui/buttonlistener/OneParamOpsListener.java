package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.gui.GuiController;

public class OneParamOpsListener implements ActionListener {

//	private  String operation = "";
	private String[] cache = new String[2];
	
	public OneParamOpsListener(String operation) {
		cache[0] = operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue();  
		if(!value.equals("")){
			cache[1] = value;
			GuiController.getInstance().calculate(cache);
		}
	}

}
