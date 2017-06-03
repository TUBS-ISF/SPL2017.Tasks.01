import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RootOps extends JPanel{
	private final GridLayout GRID = new GridLayout(4, 1); 
	
	public RootOps(){
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
