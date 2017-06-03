
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialValueListener implements ActionListener{

	private String valueKey = "";
	private ConstantManager constManager = new ConstantManager();
	
	public SpecialValueListener(String valueKey) {
		super(); 
		this.valueKey = valueKey;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	 
		String value = "ERROR"; 
		if(constManager.getMap().containsKey(valueKey)){
			value = UiController.getInstance().getDisplayValue(); 
//			value = value + ConstantManager.getInstance().getMap().get(valueKey);
			value = constManager.getMap().get(valueKey);
		}
		
		
		UiController.getInstance().setDisplayValue(value);
	}

}
