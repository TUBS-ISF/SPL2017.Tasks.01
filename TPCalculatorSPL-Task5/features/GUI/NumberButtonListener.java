
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonListener implements ActionListener{

	private String number = "";
	
	public NumberButtonListener(String number) {
		this.number = number; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = UiController.getInstance().getDisplayValue(); 
		if(!UiController.getInstance().isNewNumber()){
			value = value + number;
		}
		else{
			UiController.getInstance().setCache(1, UiController.getInstance().getDisplayValue());
			UiController.getInstance().setNewNumber(false);
			value = number;
		}
		UiController.getInstance().setDisplayValue(value);
		
	}

}
