package main.gui.buttonlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationButtonListener implements ActionListener {

	private  String operation = "";
	public OperationButtonListener(String operation) {
		this.operation = operation; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello " + this.operation);
	}

}
