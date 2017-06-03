
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PhysicalConstants extends JPanel{

	private final JButton SOS = new JButton("Sound");

	
	private void initGrid(){
			original(); 
			this.add(SOS);
	}
	
	private void setButtonListener(){
		original(); 
		SOS.addActionListener(new SpecialValueListener("SOS"));
	}
}
