package interfaces;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public interface IPanel {
	
	public JPanel getPanel(HashMap<String, JButton> buttMap);

}
