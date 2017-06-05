import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public aspect SosB {
private JButton button = new JButton("SOS"); 
private ConstantManager consMan = new ConstantManager();
	
	
	private void initButton(){
		button.addActionListener(new SpecialValueListener("SOS"));
	}
	
	/////######## Actions #######////////
	private class SpecialValueListener implements ActionListener{

		private String valueKey = "";
		
		public SpecialValueListener(String valueKey) {
			super(); 
			this.valueKey = valueKey;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {	 
			String value = "ERROR"; 
			if(consMan.getMap().containsKey(valueKey)){
				value = GUI.getInstance().getDisplayValue(); 
//				value = value + ConstantManager.getInstance().getMap().get(valueKey);
				value = consMan.getInstance().getMap().get(valueKey);
			}
			
			
			GUI.getInstance().setDisplayValue(value);
		}

	}
	/////######## Advices #######////////
	before(): execution(void ScKeys.initGrid()){
		initButton();
		ScKeys.getInstance().setButton(button);
	}
}
