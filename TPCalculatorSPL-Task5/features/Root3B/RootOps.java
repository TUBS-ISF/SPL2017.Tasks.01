import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RootOps extends JPanel{
	private final JButton ROOT3 = new JButton("Root3");
		
	private void initGrid(){
		original(); 
		this.add(ROOT3);
	}
	
	private void setButtonListener(){
		original(); 
		ROOT3.addActionListener(new OneParamOpsListener("Root3"));
	}

}
