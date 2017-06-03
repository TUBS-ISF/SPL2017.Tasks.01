import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	
	private final Vector<JPanel> panelVec = new Vector<JPanel>();
		
	private void getActivePanels(){
		original(); 
		panelVec.add(new RootOps());
	}

}
