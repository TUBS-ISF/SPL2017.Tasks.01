
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PowerOps extends JPanel{

	private final JButton POW2 = new JButton("Pow2");	
	
	private void initGrid(){
		original(); 
		this.add(POW2);
	}
	
	private void setButtonListener(){
		original(); 
		POW2.addActionListener(new OneParamOpsListener("Pow2"));
	}
}
