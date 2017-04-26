package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonListener implements ActionListener{

	private String number = "";
	
	public NumberButtonListener(String number) {
		this.number = number; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello " + this.number);
		
	}

}
