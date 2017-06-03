
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AngleOps extends JPanel{

	private final JButton COS = new JButton("cos");
		
	protected void initGrid(){
		original(); 
		this.add(COS);
	}
	
	protected void setButtonListener(){
		original(); 
		COS.addActionListener(new OneParamOpsListener("COS"));
	}
}
