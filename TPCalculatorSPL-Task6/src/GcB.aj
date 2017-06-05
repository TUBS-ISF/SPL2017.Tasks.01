import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public aspect GcB {
	
private JButton button = new JButton("GC");
private ConstantManager consMan = new ConstantManager(); 
	
	
	private void initButton(){
		button.addActionListener(new SpecialValueListener("GC"));
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
				value = consMan.getMap().get(valueKey);
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
