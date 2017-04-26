package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.gui.GuiController;

public class TwoParamOpsListener implements ActionListener{

	private String[] cache = new String[3];
	private boolean isToggeled = false; 
//	private  String operation = "";
	
	public TwoParamOpsListener(String operation) {
		cache[0] = operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue(); 
		//check for empty String
		if(!value.equals("")){
			//check isToggeled
			if(!isToggeled){
				cache[1]=value;
				GuiController.getInstance().setDisplayValue("");
				isToggeled = true; 
			}
			else{
				cache[2] = value; 
				GuiController.getInstance().calculate(cache);
				isToggeled = false; 
			}
		}
		
	}
}
