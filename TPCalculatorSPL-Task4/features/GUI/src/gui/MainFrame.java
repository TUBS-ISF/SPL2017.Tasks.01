package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

import interfaces.IButton;
import interfaces.IPanel;
import loader.PluginLoader;

public class MainFrame extends JFrame{

private static final long serialVersionUID = -1966090415318542313L;
	
	private final Vector<JPanel> panelVec = new Vector<JPanel>();
	private TextField display = new TextField();
	private JPanel keyPanel = new JPanel();
	
	private final HashMap<String, IButton> buttMap = new HashMap<String,IButton>();
	private final HashMap<String, IPanel> panelMap = new HashMap<String,IPanel>();
	
	private final String[] PANELS = {"ConstantsPanel", "BaseButtons", "BasePanel", 
									"PotencyPanel", "AnglePanel", "RootsPanel"}; 
	
	public MainFrame(){
		super(); 
		System.out.println("Main started");
		initButtonMap();
		initPanelMap();
		getActivePanels();
		initKeyPanel();
		initDisplay();
		initMainFrame();
	}
	
	private void initButtonMap(){
		List<IButton> buttonPlugins = PluginLoader.load(IButton.class);
		for(IButton butt : buttonPlugins){
			System.out.println("Classname: " + butt.getClass().getName());
			String key = butt.getClass().getName().toUpperCase(); 
			buttMap.put(key, butt); 
		}
	}
	
	private void initPanelMap(){
		List<IPanel> panelPlugins = PluginLoader.load(IPanel.class);
		for(IPanel panel : panelPlugins){
			System.out.println("Classname: " + panel.getClass().getName());
			String key = panel.getClass().getName().toUpperCase(); 
			panelMap.put(key, panel); 
		}
		panelMap.put("BaseButtons", new BaseButtons()); 
	}
	
	private void initKeyPanel(){
		keyPanel.setLayout(new FlowLayout());
//		for(JPanel panel: panelVec){
//			keyPanel.add(panel);
//		}
		for(String key : PANELS){
			if(panelMap.containsKey(key)){
				keyPanel.add(panelMap.get(key).getPanel());
			}
		}
	}
	
	private Vector<JPanel> getActivePanels(){
//		/*if[SC]*/	
//		panelVec.add(new PhysicalConstants());
//		panelVec.add(new MathConstants());
//		/*end[SC]*/
//		
		//Base Buttons are always shown, so no if condition for this one.
//		panelVec.add(new BaseButtons());
//		
//		/*if[Base]*/	
//		panelVec.add(new BaseOperation());
//		/*end[Base]*/
//		
//		/*if[Potencies]*/	
//		panelVec.add(new PowerOps());
//		/*end[Potencies]*/
//			
//		/*if[AngleOps]*/	
//		panelVec.add(new AngleOps());
//		/*end[AngleOps]*/
//			
//		/*if[Roots]*/	
//		panelVec.add(new RootOps());
//		/*end[Roots]*/
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
