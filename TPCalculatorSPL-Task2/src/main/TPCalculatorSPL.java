package main;

import java.io.IOException;

import main.cli.CommandLine;
import main.gui.GuiController;
import properties.PropertyManager;



/**
 * Main Method to start the Application and to decide if a GUI or CLI is used further.
 */
public class TPCalculatorSPL {
	
	public TPCalculatorSPL(){
		super();
		if (PropertyManager.getProperty("GUI")) {
			GuiController.getInstance();
		}
		if(PropertyManager.getProperty("CLI")){
			CommandLine cli = new CommandLine(); 
		}
	}
	
	
	public static void main(String args0[]) throws IOException{
		TPCalculatorSPL application = new TPCalculatorSPL(); 
	}
}