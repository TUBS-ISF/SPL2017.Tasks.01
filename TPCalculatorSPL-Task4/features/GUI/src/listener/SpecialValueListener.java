package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import gui.GuiController;
import interfaces.IConstant;
import loader.PluginLoader;

public class SpecialValueListener implements ActionListener{

	private String valueKey = "";
	private  HashMap<String, IConstant> constantMap = new HashMap<String, IConstant>();
	
	public SpecialValueListener(String valueKey) {
		super(); 
		this.valueKey = valueKey;
		List<IConstant> constantPlugins = PluginLoader.load(IConstant.class);
		for(IConstant cons : constantPlugins){
			String key = cons.getClass().getName().toUpperCase(); 
			constantMap.put(key, cons); 
		}
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
