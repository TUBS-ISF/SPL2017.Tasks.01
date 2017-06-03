import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BaseOperation extends JPanel{

	private final JButton MUL = new JButton("*");
	
	private void initGrid(){
		original(); 
		this.add(MUL);
	}
	
	private void setButtonListener(){
		original(); 
		MUL.addActionListener(new TwoParamOpsListener("MUL"));
	}
	
}
