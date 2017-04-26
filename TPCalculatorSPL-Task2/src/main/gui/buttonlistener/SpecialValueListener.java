package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.ConstantManager;
import main.gui.GuiController;

public class SpecialValueListener implements ActionListener{

	private String valueKey = "";
	
	public SpecialValueListener(String valueKey) {
		super(); 
		this.valueKey = valueKey;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	 
		String value = "ERROR"; 
		if(ConstantManager.getInstance().getMap().containsKey(valueKey)){
			value = GuiController.getInstance().getDisplayValue(); 
//			value = value + ConstantManager.getInstance().getMap().get(valueKey);
			value = ConstantManager.getInstance().getMap().get(valueKey);
		}
		
		
		GuiController.getInstance().setDisplayValue(value);
	}

}
