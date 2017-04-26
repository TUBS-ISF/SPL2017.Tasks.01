package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialCharListener implements ActionListener{
	
	private  String character = "";
	public SpecialCharListener(String character) {
		this.character = character; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello " + this.character);
	}

}
