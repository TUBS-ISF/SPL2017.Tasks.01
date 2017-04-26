package main.gui;

/**
 * TODO description
 */
public class GuiController {
	
	public static GuiController instance = null; 
	private MainFrame mainFrame = null; 
	
	private GuiController(){
		mainFrame = new MainFrame(); 	
	}
	
	public static GuiController getInstance(){
		if(instance == null){
			instance = new GuiController(); 
		}
		return instance; 
	}
	
	public String getDisplayValue(){
		return mainFrame.getDispalyValue();
	}
	
	public void setDisplayValue(String value){
		mainFrame.setDisplayValue(value);
	}
	
	public void calculate(String[] terms){
		// String Value which should be shown in the display after calculation
		String solution = "Default"; 
		// call calculation logic for calculation and override solution String
		mainFrame.setDisplayValue(solution);
		// Test Output until calculation logic is finished
		System.out.println("Array length: " + terms.length);
		for(String s : terms){
			System.out.println(s);
		}
		
	}
	
	
	

}