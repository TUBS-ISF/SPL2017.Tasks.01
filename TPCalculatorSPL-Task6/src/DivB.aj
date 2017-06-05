import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public aspect DivB {
private JButton button = new JButton("/"); 
	
	
	private void initButton(){
		button.addActionListener(new TwoParamAction("DIV"));
	}
	
	/////######## Actions #######////////
	private class TwoParamAction implements ActionListener{
		private  String operation = "";
		
		public TwoParamAction(String operation) {
			this.operation = operation; 
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = GUI.getInstance().getDisplayValue();
			
			//check for empty String
			if(!value.equals("")){
				GUI.getInstance().setCache(0, operation);
				//check isToggeled
				if(!GUI.getInstance().isToggeled()){
					GUI.getInstance().setCache(1, value);
					GUI.getInstance().setNewNumber(true);
					GUI.getInstance().setToggeled(true);
				}
				else{
					GUI.getInstance().setCache(2, value);
					GUI.getInstance().calculate();
					System.out.println("Action called");
				}
			}
			
		}
	}
	/////######## Advices #######////////
	before(): execution(void BaseBut.initGrid()){
		initButton();
		BaseBut.getInstance().setButton(button);
	}
}
