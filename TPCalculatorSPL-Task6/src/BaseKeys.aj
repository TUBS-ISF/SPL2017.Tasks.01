import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public aspect BaseKeys {

	private GridLayout GRID = new GridLayout(4, 4);
	private JPanel panel = new JPanel(); 
	
	private final JButton B0 = new JButton("0");
	private final JButton B1 = new JButton("1");
	private final JButton B2 = new JButton("2");
	private final JButton B3 = new JButton("3");
	private final JButton B4 = new JButton("4");
	private final JButton B5 = new JButton("5");
	private final JButton B6 = new JButton("6");
	private final JButton B7 = new JButton("7");
	private final JButton B8 = new JButton("8");
	private final JButton B9 = new JButton("9");
	private final JButton DEL = new JButton("DEL");
	private final JButton AC = new JButton("AC");
	private final JButton LBR = new JButton("(");
	private final JButton RBR = new JButton(")");
	private final JButton EQ = new JButton("=");
	private final JButton KOMMA = new JButton(",");
	
	private void initBasePanel(){
		panel.setLayout(GRID);
		initGrid();
		setButtonListener();
	}
	
	private void initGrid(){
		panel.add(B7);
		panel.add(B8);
		panel.add(B9);
		panel.add(EQ);
		panel.add(B4);
		panel.add(B5);
		panel.add(B6);
		panel.add(KOMMA);
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(RBR);
		panel.add(AC);
		panel.add(B0);
		panel.add(DEL);
		panel.add(LBR);
		
		LBR.setVisible(false);
		RBR.setVisible(false);
		
	}
	
	private void setButtonListener(){
		B0.addActionListener(new NumberListener("0"));
		B1.addActionListener(new NumberListener("1"));
		B2.addActionListener(new NumberListener("2"));
		B3.addActionListener(new NumberListener("3"));
		B4.addActionListener(new NumberListener("4"));
		B5.addActionListener(new NumberListener("5"));
		B6.addActionListener(new NumberListener("6"));
		B7.addActionListener(new NumberListener("7"));
		B8.addActionListener(new NumberListener("8"));
		B9.addActionListener(new NumberListener("9"));
		
		RBR.addActionListener(new SpecialCharListener(")"));
		LBR.addActionListener(new SpecialCharListener("("));
		KOMMA.addActionListener(new SpecialCharListener("."));
		
		AC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUI.getInstance().setDisplayValue("");
				GUI.getInstance().clearCache(); 	
				GUI.getInstance().setToggeled(false);
			}
		});
		
		DEL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUI.getInstance().setDisplayValue(""); 
				
			}
		});
		
		EQ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(GUI.getInstance().isToggeled()){
					String value = GUI.getInstance().getDisplayValue(); 
					GUI.getInstance().setCache(2, value);
					GUI.getInstance().calculate();
//					GuiController.getInstance().setCache(1, value);
					GUI.getInstance().setToggeled(false);
				}
				else{
					GUI.getInstance().calculate();
				}
					
			}
		});
	}
	
	///######### Listener #########/////
	private class NumberListener implements ActionListener{

		private String number = "";
		
		public NumberListener(String number) {
			this.number = number; 
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = GUI.getInstance().getDisplayValue(); 
			if(!GUI.getInstance().isNewNumber()){
				value = value + number;
			}
			else{
				GUI.getInstance().setCache(1, GUI.getInstance().getDisplayValue());
				GUI.getInstance().setNewNumber(false);
				value = number;
			}
			GUI.getInstance().setDisplayValue(value);
		}
	}
	
	private class SpecialCharListener implements ActionListener{
		private  String character = "";
		public SpecialCharListener(String character) {
			this.character = character; 
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = GUI.getInstance().getDisplayValue();
			if(character.equals(".") && value.equals("")){
				value = "0"; 
			}
			GUI.getInstance().setDisplayValue(value + character);
		}
	}
	
	///######## Advices ########//////
	before(): execution(void GUI.getActivePanels()){
		setPanel(); 
	}
	
	private void setPanel(){
		initBasePanel();
		GUI.getInstance().getPanelVec().add(panel); 
	}
}
