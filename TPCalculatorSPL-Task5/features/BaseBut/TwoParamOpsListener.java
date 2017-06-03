
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoParamOpsListener implements ActionListener{

	
	private  String operation = "";
	
	public TwoParamOpsListener(String operation) {
		this.operation = operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = UiController.getInstance().getDisplayValue();
		
		//check for empty String
		if(!value.equals("")){
			UiController.getInstance().setCache(0, operation);
			//check isToggeled
			if(!UiController.getInstance().isToggeled()){
				UiController.getInstance().setCache(1, value);
				UiController.getInstance().setNewNumber(true);
				UiController.getInstance().setToggeled(true);
			}
			else{
				UiController.getInstance().setCache(2, value);
				UiController.getInstance().calculate();
				System.out.println("Action called");
			}
		}
		
	}
}
