package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import gui.GuiController;
import interfaces.IConstant;

public class SpecialValueListener implements ActionListener{

	private String valueKey = "";
	private  HashMap<String, IConstant> constantMap = new HashMap<String, IConstant>();
	
	public SpecialValueListener(String valueKey) {
		super(); 
		this.valueKey = valueKey;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	 
		String value = "ERROR"; 
		if(constantMap.containsKey(valueKey)){
			value = GuiController.getInstance().getDisplayValue(); 
//			value = value + ConstantManager.getInstance().getMap().get(valueKey);
			value = constantMap.get(valueKey).getValue();
		}
		
		GuiController.getInstance().setDisplayValue(value);
	}

}
