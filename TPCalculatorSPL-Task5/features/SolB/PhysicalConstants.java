import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PhysicalConstants extends JPanel{

	private final JButton SOL = new JButton("Light");

	private void initGrid(){
			original(); 
			this.add(SOL);
	}
	
	private void setButtonListener(){
		original(); 
		SOL.addActionListener(new SpecialValueListener("SOL"));
	}
}
