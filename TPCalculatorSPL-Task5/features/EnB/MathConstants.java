
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MathConstants extends JPanel{
	
	
	private final JButton EN = new JButton("e");
		
	
	private void initGrid(){
		original(); 
		this.add(EN);
	}
	
	private void setButtonListener(){
		original(); 
		EN.addActionListener(new SpecialValueListener("EN"));
	}
}
