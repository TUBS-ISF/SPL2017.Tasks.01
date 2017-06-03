import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	private final Vector<JPanel> panelVec = new Vector<JPanel>();
	private TextField display = new TextField();
	private JPanel keyPanel = new JPanel();
	
	public MainFrame(){
		super(); 
		getActivePanels();
		initKeyPanel();
		initDisplay();
		initMainFrame();
	}
	
	private void initKeyPanel(){
		keyPanel.setLayout(new FlowLayout());
		for(JPanel panel: panelVec){
			keyPanel.add(panel);
		}
	}
	
	private void getActivePanels(){
//		//Base Buttons are always shown, so no if condition for this one.
		panelVec.add(new BaseButtons());
	}
	
	private void initDisplay(){
		display.setPreferredSize(new Dimension(this.getWidth(),50));
		display.setEnabled(false);
	}
	
	private void initMainFrame(){
		this.setSize(calcFrameWidth(), 180);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setTitle("TPCalcualtorSPL");
		this.add(display, BorderLayout.NORTH);
		this.add(keyPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	private int calcFrameWidth(){
		return (panelVec.size() + 3) * 68; 
	}
	
	public String getDispalyValue(){
		return display.getText(); 
	}
	
	public void setDisplayValue(String value){
		display.setText(value);
	}

}
