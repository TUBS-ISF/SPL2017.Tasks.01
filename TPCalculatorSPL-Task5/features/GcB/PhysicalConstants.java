
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PhysicalConstants extends JPanel{

	private final JButton GC = new JButton("Gravi");

	
	private void initGrid(){
			original(); 
			this.add(GC);
	}
	
	private void setButtonListener(){
		original(); 
		GC.addActionListener(new SpecialValueListener("GC"));
	}
}
