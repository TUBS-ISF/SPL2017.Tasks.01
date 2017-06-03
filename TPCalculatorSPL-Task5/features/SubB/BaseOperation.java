import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BaseOperation extends JPanel{

	private final JButton SUB = new JButton("-"); 
	
	
	private void initGrid(){
		original(); 
		this.add(SUB);
	}
	
	private void setButtonListener(){
		original(); 
		SUB.addActionListener(new TwoParamOpsListener("SUB"));
	}
	
}
