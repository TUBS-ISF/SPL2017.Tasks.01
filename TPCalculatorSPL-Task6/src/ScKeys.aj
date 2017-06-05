import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

public aspect ScKeys {
	private final GridLayout GRID = new GridLayout(5, 1); 
	private JPanel panel = new JPanel(); 
	private Vector<JButton> buttonVec = new Vector<JButton>(); 
	public static ScKeys instance = null; 
	
	private void initBaseOperation(){
		instance = this; 
		panel.setLayout(GRID);
		initGrid(); 
	}
	
	private void initGrid(){
		for(JButton button : buttonVec){
			panel.add(button); 
		}
	}
	
	public void setButton(JButton button){
		buttonVec.add(button); 
	}
	
	public static ScKeys getInstance(){
		return instance; 
	}
	
	///######## Advices ########//////
	before(): execution(void GUI.getActivePanels()){
		setPanel(); 
	}
	
	private void setPanel(){
		initBaseOperation();
		GUI.getInstance().getPanelVec().add(panel); 
	}
}
