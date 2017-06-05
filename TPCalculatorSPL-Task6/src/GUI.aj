import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public aspect GUI {
	
	public static GUI instance = null; 
	private JFrame mainFrame = new JFrame(); 
	
	private String[] cache = new String[6];
	private boolean toggeled = false; 
	private boolean newNumber = false; 
	private CalculationController clacLogic = new CalculationController();
	
	private final Vector<JPanel> panelVec = new Vector<JPanel>();
	private TextField display = new TextField();
	private JPanel keyPanel = new JPanel();
	
	
	///########## MainFrame Methods ########/////
	private void initKeyPanel(){
		keyPanel.setLayout(new FlowLayout());
		for(JPanel panel: panelVec){
			keyPanel.add(panel);
		}
	}
	
//	private Vector<JPanel> getActivePanels(){
	private void getActivePanels(){
		System.out.println("initialize Pannels");
//		panelVec.add(new PhysicalConstants());
//		panelVec.add(new MathConstants());
//		//Base Buttons are always shown, so no if condition for this one.
//		panelVec.add(new BaseButtons());
//		
//		panelVec.add(new BaseOperation());
//		
//		panelVec.add(new PowerOps());
//			
//		panelVec.add(new AngleOps());
//			
//		panelVec.add(new RootOps());
	}
	
	private void initDisplay(){
		display.setPreferredSize(new Dimension(mainFrame.getWidth(),50));
		display.setEnabled(false);
	}
	
	private void initMainFrame(){
		mainFrame.setSize(calcFrameWidth(), 210);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setTitle("TPCalcualtorSPL");
		mainFrame.add(display, BorderLayout.NORTH);
		mainFrame.add(keyPanel, BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
	
	private int calcFrameWidth(){
		return (panelVec.size() + 3) * 68; 
	}
	
//###### GuiController Methods #########///
	
	private void initCache(){
		for(int i = 0; i<cache.length; i++){
			cache[i] = "0";
		}
	}
	
	public String getDisplayValue(){
		return display.getText(); 
	}
	
	public void setDisplayValue(String value){
		display.setText(value);
	}
	
	public void calculate(){
		String solution = clacLogic.calculate(cache); 
		setDisplayValue(solution);
		newNumber = true; 
		}
	
	public void setCache(int pos, String value){
		cache[pos] = value; 		
	}

	public boolean isToggeled() {
		return toggeled;
	}

	public void setToggeled(boolean isToggeled) {
		this.toggeled = isToggeled;
	}
	
	public void clearCache(){
		for(int i = 0; i < cache.length; i++){
			cache[i] = "0"; 
		}
		newNumber = false; 
	}

	public boolean isNewNumber() {
		return newNumber;
	}

	public void setNewNumber(boolean calculated) {
		this.newNumber = calculated;
	}
	
////######### GUI Methods #########/////	
	private void initGui(){
		System.out.println("initialize Gui");
		instance = this; 
		initCache();
		getActivePanels();
		initKeyPanel();
		initDisplay();
		initMainFrame();
	}
	
	public static GUI getInstance(){
		return instance; 
	}
	
	public Vector<JPanel> getPanelVec() {
		return panelVec;
	}
	
////######### Advices #######//////	
	after(): execution(void TPCalculatorSPL.initUi()){
		initGui(); 
	}
	

}
