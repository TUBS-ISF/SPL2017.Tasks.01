import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public aspect SinB {
private JButton button = new JButton("SIN"); 
	
	
	private void initButton(){
		button.addActionListener(new OneParamAction("SIN"));
	}
	
	/////######## Actions #######////////
	private class OneParamAction implements ActionListener{
		private  String operation = "";
		
		public OneParamAction(String operation) {
			this.operation= operation; 
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = GUI.getInstance().getDisplayValue();  
			if(!value.equals("")){
				GUI.getInstance().setCache(0, operation);
				GUI.getInstance().setCache(1, value);
				GUI.getInstance().calculate();
			}
		}
	}
	/////######## Advices #######////////
	before(): execution(void AngleBut.initGrid()){
		initButton();
		AngleBut.getInstance().setButton(button);
	}
}
