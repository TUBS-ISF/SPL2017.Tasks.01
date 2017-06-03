
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MathConstants extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	public MathConstants(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	private void initGrid(){
	}
	
	private void setButtonListener(){
	}
}
