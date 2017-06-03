
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MathConstants extends JPanel{
	
	private final JButton PI = new JButton("PI");
		
	
	private void initGrid(){
		original(); 
		this.add(PI);
	}
	
	private void setButtonListener(){
		original(); 
		PI.addActionListener(new SpecialValueListener("PI"));
	}
}
