import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.IPanel;

public class ConstantsPanel implements IPanel{

	private JPanel panel = new JPanel(); 
	private final String[] LIST = {"EnButton", "GcButton", "PiButton", "SolButton","SosButton"};
	
	private final GridLayout GRID = new GridLayout(5, 1); 
	
	@Override
	public JPanel getPanel(HashMap<String, JButton> buttMap) {
		panel.setLayout(GRID);
		
		for(String key : LIST){
			if(buttMap.containsKey(key)){
				JButton button = buttMap.get(key);
				panel.add(button); 
			}
		}
		return panel;
	}

}
