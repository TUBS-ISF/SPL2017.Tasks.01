import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BaseOperation extends JPanel{

	private final JButton DIV = new JButton("/");
	
	private void initGrid(){
		original(); 
		this.add(DIV);
	}
	
	private void setButtonListener(){
		original(); 
		DIV.addActionListener(new TwoParamOpsListener("DIV"));
	}
	
}
