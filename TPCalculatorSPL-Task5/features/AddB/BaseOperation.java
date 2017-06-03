import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BaseOperation extends JPanel{

	private final JButton ADD = new JButton("+");
	private void initGrid(){
		original(); 
		this.add(ADD);
	}
	
	private void setButtonListener(){
		original(); 
		ADD.addActionListener(new TwoParamOpsListener("ADD"));
	}
	
}
