package main.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.gui.buttonpanels.AreaOps;
import main.gui.buttonpanels.BaseButtons;
import main.gui.buttonpanels.BaseOperation;
import main.gui.buttonpanels.MathConstants;
import main.gui.buttonpanels.PerimeterOps;
import main.gui.buttonpanels.PhysicalConstants;
import main.gui.buttonpanels.PowerOps;
import main.gui.buttonpanels.RootOps;

/**
 * TODO description
 */
public class GuiController {
	private JFrame mainFrame = new JFrame("tpCalcualtorSPL"); 
	private TextField inputField = new TextField();
	private JPanel keyPanel = new JPanel();
	
	
	public GuiController(){
		initMainFrame();
		initInputField();
		initKeyPanel(); 
		
		mainFrame.add(inputField, BorderLayout.NORTH);
		 
		mainFrame.add(keyPanel, BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
	
	
	private void initKeyPanel(){
		Vector<JPanel> panelVec = getActivePanels();
		keyPanel.setLayout(new FlowLayout());
		for(JPanel panel: panelVec){
			keyPanel.add(panel);
		}
	}
	
	private Vector<JPanel> getActivePanels(){
		Vector<JPanel> panelVec = new Vector<JPanel>();
		panelVec.add(new PhysicalConstants());
		panelVec.add(new MathConstants());
		panelVec.add(new BaseButtons());
		panelVec.add(new BaseOperation());
		panelVec.add(new PowerOps());
		panelVec.add(new RootOps());
		panelVec.add(new AreaOps());
		panelVec.add(new PerimeterOps());
		return panelVec;
	}
	
	private void initInputField(){
		inputField.setPreferredSize(new Dimension(mainFrame.getWidth(),50));
		inputField.setEnabled(false);
	}
	
	private void initMainFrame(){
		mainFrame.setSize(750, 180);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
	}
	
	
	public String getInput(){
		inputField.getText(); 
		return ""; 
	}

}