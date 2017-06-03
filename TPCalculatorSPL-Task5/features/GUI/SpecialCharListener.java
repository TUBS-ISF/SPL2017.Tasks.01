
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialCharListener implements ActionListener{
	
	private  String character = "";
	public SpecialCharListener(String character) {
		this.character = character; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = UiController.getInstance().getDisplayValue();
		if(character.equals(".") && value.equals("")){
			value = "0"; 
		}
		UiController.getInstance().setDisplayValue(value + character);
	}

}
