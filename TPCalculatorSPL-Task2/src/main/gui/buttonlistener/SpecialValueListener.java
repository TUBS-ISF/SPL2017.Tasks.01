package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.ConstantManager;

public class SpecialValueListener implements ActionListener{

	private String valueKey = "";
	
	public SpecialValueListener(String valueKey) {
		super(); 
		this.valueKey = valueKey;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (this.valueKey){
		case "PI":
			System.out.println(ConstantManager.getInstance().getPI());
			break; 
		case "EN":
			System.out.println(ConstantManager.getInstance().getEN());
			break; 
		case "SOS":
			System.out.println(ConstantManager.getInstance().getSOS());
			break;
		case "SOL":
			System.out.println(ConstantManager.getInstance().getSOL());
			break;
		case "GC":
			System.out.println(ConstantManager.getInstance().getGC());
			break; 
		default:
			System.out.println("Unknown Constant Value");
		}
			 
		
	}

}
