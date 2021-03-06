package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.GuiController;

public class TwoParamOpsListener implements ActionListener{

	
	private  String operation = "";
	
	public TwoParamOpsListener(String operation) {
		this.operation = operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = GuiController.getInstance().getDisplayValue();
		
		//check for empty String
		if(!value.equals("")){
			GuiController.getInstance().setCache(0, operation);
			//check isToggeled
			if(!GuiController.getInstance().isToggeled()){
				GuiController.getInstance().setCache(1, value);
				GuiController.getInstance().setNewNumber(true);
				GuiController.getInstance().setToggeled(true);
			}
			else{
				GuiController.getInstance().setCache(2, value);
				GuiController.getInstance().calculate();
				System.out.println("Action called");
			}
		}
		
	}
}
