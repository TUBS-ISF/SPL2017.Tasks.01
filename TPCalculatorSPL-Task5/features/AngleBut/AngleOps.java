
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AngleOps extends JPanel{
	
private final GridLayout GRID = new GridLayout(4, 1); 
	
	public AngleOps(){
		super();
		this.setLayout(GRID);
		initGrid();
		setButtonListener(); 
	}
	
	protected void initGrid(){
	}
	
	protected void setButtonListener(){
	}
}
