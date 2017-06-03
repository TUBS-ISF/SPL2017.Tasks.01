
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AngleOps extends JPanel{
	
private final JButton SIN = new JButton("sin");
	
	protected void initGrid(){
		original(); 	
		this.add(SIN);
	}
	
	protected void setButtonListener(){
		original(); 
		SIN.addActionListener(new OneParamOpsListener("SIN"));
	}
}
