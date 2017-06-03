
public class UiController {

	public static UiController instance = null; 
	private MainFrame mainFrame = null; 
	
	private String[] cache = new String[6];
	private boolean toggeled = false; 
	private boolean newNumber = false; 
	private CalculationLogic clacLogic = new CalculationLogic(); 
	
	private UiController(){
		instance = this;
		mainFrame = new MainFrame();
		initCache();
	}
	
	public static UiController getInstance(){
		if(instance == null){
			instance = new UiController(); 
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
		newNumber = true; 
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
		newNumber = false; 
	}

	public boolean isNewNumber() {
		return newNumber;
	}

	public void setNewNumber(boolean calculated) {
		this.newNumber = calculated;
	}
	
}
