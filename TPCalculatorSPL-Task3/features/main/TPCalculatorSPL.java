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
		/*if[GUI]*/	
		GuiController.getInstance();
		/*end[GUI]*/
		
		/*if[CLI]*/	
		CommandLine cli = new CommandLine();
		/*end[CLI]*/
	}
	
	
	public static void main(String args0[]) throws IOException{
		TPCalculatorSPL application = new TPCalculatorSPL(); 
	}
}