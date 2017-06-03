
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PowerOps extends JPanel{

	private final JButton POW3 = new JButton("Pow3");
	
	private void initGrid(){
		original(); 
		this.add(POW3);
	}
	
	private void setButtonListener(){
		original(); 
		POW3.addActionListener(new OneParamOpsListener("Pow3"));
	}
}
