package main.gui;

import main.calculationLogic.CalculationLogic;

/**
 * TODO description
 */
public class GuiController {
	
	public static GuiController instance = null; 
	private MainFrame mainFrame = null; 
	
	private String[] cache = new String[6];
	private boolean toggeled = false; 
	private CalculationLogic clacLogic = new CalculationLogic(); 
	
	private GuiController(){
		mainFrame = new MainFrame();
		initCache();
	}
	
	public static GuiController getInstance(){
		if(instance == null){
			instance = new GuiController(); 
		}
		return instance; 
	}
	
	private void initCache(){
		for(int i = 0; i<cache.length; i++){
			cache[i] = "0";
		}
	}
	
	public String getDisplayValue(){
		return mainFrame.getDispalyValue();
	}
	
	public void setDisplayValue(String value){
		mainFrame.setDisplayValue(value);
	}
	
	public void calculate(){
		String solution = clacLogic.calculate(cache); 
		mainFrame.setDisplayValue(solution);
		}
	
	public void setCache(int pos, String value){
		cache[pos] = value; 
	}

	public boolean isToggeled() {
		return toggeled;
	}

	public void setToggeled(boolean isToggeled) {
		this.toggeled = isToggeled;
	}
	
	public void clearCache(){
		for(int i = 0; i < cache.length; i++){
			cache[i] = "0"; 
		}
	}
	
	
	

}