package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.GuiController;

public class OneParamOpsListener implements ActionListener {

	private  String operation = "";
	
	public OneParamOpsListener(String operation) {
		this.operation= operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue();  
		if(!value.equals("")){
			GuiController.getInstance().setCache(0, operation);
			GuiController.getInstance().setCache(1, value);
			GuiController.getInstance().calculate();
		}
	}

}
