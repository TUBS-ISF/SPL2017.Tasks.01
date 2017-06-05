import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public aspect Pow2B {
private JButton button = new JButton("POW2"); 
	
	
	private void initButton(){
		button.addActionListener(new OneParamAction("POW2"));
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
	before(): execution(void PowerBut.initGrid()){
		initButton();
		PowerBut.getInstance().setButton(button);
	}
}
