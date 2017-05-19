package main;

import java.io.IOException;

import main.cli.CommandLine;
import main.gui.GuiController;



/**
 * Main Method to start the Application and to decide if a GUI or CLI is used further.
 */

/**
 * 
 * @author tobias
 */
public class TPCalculatorSPL {
	
	public TPCalculatorSPL(){
		super();
			
		GuiController.getInstance();
		
		
		


	}
	
	
	public static void main(String args0[]) throws IOException{
		TPCalculatorSPL application = new TPCalculatorSPL(); 
	}
}