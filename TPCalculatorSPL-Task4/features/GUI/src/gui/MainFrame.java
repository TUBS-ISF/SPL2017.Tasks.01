package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfaces.IButton;
import interfaces.IPanel;
import listener.OneParamOpsListener;
import listener.SpecialValueListener;
import listener.TwoParamOpsListener;
import loader.PluginLoader;

public class MainFrame extends JFrame{

private static final long serialVersionUID = -1966090415318542313L;
	
	private final Vector<JPanel> panelVec = new Vector<JPanel>();
	private TextField display = new TextField();
	private JPanel keyPanel = new JPanel();
	
	private final HashMap<String, IButton> iButtMap = new HashMap<String,IButton>();
	private final HashMap<String, IPanel> iPanelMap = new HashMap<String,IPanel>();
	private final HashMap<String, JButton> buttonMap = new HashMap<String,JButton>();
	
	private final String[] PANELS = {"ConstantsPanel", "BaseButtons", "BasePanel", 
									"PotencyPanel", "AnglePanel", "RootsPanel"}; 
	
	public MainFrame(){
		super(); 
		initIButtonMap();
		initButtonMap();
		initIPanelMap();
		initKeyPanel();
		initDisplay();
		initMainFrame();
	}
	
	private void initIButtonMap(){
		List<IButton> buttonPlugins = PluginLoader.load(IButton.class);
		for(IButton butt : buttonPlugins){
			String key = butt.getClass().getName(); 
			iButtMap.put(key, butt); 
		}
	}
	
	private void initIPanelMap(){
		List<IPanel> panelPlugins = PluginLoader.load(IPanel.class);
		for(IPanel panel : panelPlugins){
			String key = panel.getClass().getName(); 
			iPanelMap.put(key, panel); 
		}
		iPanelMap.put("BaseButtons", new BaseButtons()); 
	}
	
	private void initKeyPanel(){
		keyPanel.setLayout(new FlowLayout());
		for(String key : PANELS){
			if(iPanelMap.containsKey(key)){
				JPanel panel = iPanelMap.get(key).getPanel(buttonMap); 
				keyPanel.add(panel);
				panelVec.add(panel);
			}
		}
	}
	
	private void initDisplay(){
		display.setPreferredSize(new Dimension(this.getWidth(),50));
		display.setEnabled(false);
	}
	
	private void initMainFrame(){
		this.setSize(calcFrameWidth(), 200);
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
	
	private void initButtonMap(){
		for(String key : iButtMap.keySet()){
			JButton button = iButtMap.get(key).getButton(); 
			switch(key){
			//base ops
			case "AddButton":
				button.addActionListener(new TwoParamOpsListener("ADD"));
				break; 
			case "SubButton":
				button.addActionListener(new TwoParamOpsListener("SUB"));
				break;
			case "MulButton": 
				button.addActionListener(new TwoParamOpsListener("MUL"));
				break;
			case "DivButton":
				button.addActionListener(new TwoParamOpsListener("DIV"));
				break;
			//angle ops
			case "CosButton":
				button.addActionListener(new OneParamOpsListener("COS"));
				break;
			case "SinButton":
				button.addActionListener(new OneParamOpsListener("SIN"));
				break;
			case "TanButton": 
				button.addActionListener(new OneParamOpsListener("TAN"));
				break;
			//potency ops
			case "Pow2Button": 
				button.addActionListener(new OneParamOpsListener("Pow2"));
				break; 
			case "Pow3Button": 
				button.addActionListener(new OneParamOpsListener("Pow3"));
				break; 
			case "Pow4Button": 
				button.addActionListener(new OneParamOpsListener("Pow4"));
				break;
			//rootOps
			case "Root3Button": 
				button.addActionListener(new OneParamOpsListener("Root3"));
				break; 
			case "Root2Button":
				button.addActionListener(new OneParamOpsListener("Root2"));
				break;
			//constants
			case "EnButton": 
				button.addActionListener(new SpecialValueListener("EN"));
				break; 
			case "GcButton":
				button.addActionListener(new SpecialValueListener("GC"));
				break; 
			case "PiButton": 
				button.addActionListener(new SpecialValueListener("PI"));
				break; 
			case "SolButton": 
				button.addActionListener(new SpecialValueListener("SOL"));
				break; 
			case "SosButton": 
				button.addActionListener(new SpecialValueListener("SOS"));
				break; 
			}
			buttonMap.put(key, button); 
		}
	}
}
