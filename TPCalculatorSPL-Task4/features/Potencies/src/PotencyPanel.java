import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.IPanel;

public class PotencyPanel implements IPanel{

	private JPanel panel = new JPanel(); 
	private final String[] LIST = {"Pow2Button", "Pow3Button", "Pow4Button"};
	
	private final GridLayout GRID = new GridLayout(4, 1); 
	
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
