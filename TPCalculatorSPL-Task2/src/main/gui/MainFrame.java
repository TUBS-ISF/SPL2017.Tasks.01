package main.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.gui.buttonpanels.AngleOps;
import main.gui.buttonpanels.AreaOps;
import main.gui.buttonpanels.BaseButtons;
import main.gui.buttonpanels.BaseOperation;
import main.gui.buttonpanels.MathConstants;
import main.gui.buttonpanels.PerimeterOps;
import main.gui.buttonpanels.PhysicalConstants;
import main.gui.buttonpanels.PowerOps;
import main.gui.buttonpanels.RootOps;
import properties.PropertyManager;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1966090415318542313L;
	
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
	
	private Vector<JPanel> getActivePanels(){
		if(PropertyManager.getProperty("SC")){
			panelVec.add(new PhysicalConstants());
			panelVec.add(new MathConstants());
		}
		//Base Buttons are always shown, so no if condition for this one.
		panelVec.add(new BaseButtons());
		
		if(PropertyManager.getProperty("Base")){
			panelVec.add(new BaseOperation());
		}
		if(PropertyManager.getProperty("Potencies")){
			panelVec.add(new PowerOps());
		}
		if(PropertyManager.getProperty("AngleOps")){
			panelVec.add(new AngleOps());
		}
		if(PropertyManager.getProperty("Roots")){
			panelVec.add(new RootOps());
		}
		return panelVec;
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
