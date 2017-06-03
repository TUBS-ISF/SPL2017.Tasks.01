
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AngleOps extends JPanel{
	
private final JButton TAN = new JButton("tan");
		
	protected void initGrid(){
		original(); 
		this.add(TAN);
	}
	
	protected void setButtonListener(){
		original(); 
		TAN.addActionListener(new OneParamOpsListener("TAN"));
	}
}
