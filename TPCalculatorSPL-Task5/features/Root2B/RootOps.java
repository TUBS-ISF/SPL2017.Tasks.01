import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RootOps extends JPanel{
	private final JButton ROOT2 = new JButton("Root2");

	private void initGrid(){
		original();
		this.add(ROOT2);
	}
	
	private void setButtonListener(){
		ROOT3.addActionListener(new OneParamOpsListener("Root2"));
	}

}
