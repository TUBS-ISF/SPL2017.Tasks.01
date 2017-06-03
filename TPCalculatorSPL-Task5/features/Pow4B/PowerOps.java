import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PowerOps extends JPanel{

	private final JButton POW4 = new JButton("Pow4");
	
	private void initGrid(){
		original(); 
		this.add(POW4);
	}
	
	private void setButtonListener(){
		original(); 
		POW4.addActionListener(new OneParamOpsListener("Pow4"));
	}
}
