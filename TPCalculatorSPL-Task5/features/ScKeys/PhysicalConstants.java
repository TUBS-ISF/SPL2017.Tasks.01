import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PhysicalConstants extends JPanel{

private final GridLayout GRID = new GridLayout(4, 1); 
	
	public PhysicalConstants(){
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
