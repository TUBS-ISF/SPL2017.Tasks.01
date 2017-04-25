package main.cli;

import java.util.Scanner;

import main.calculationLogic.EquationInterpreter;

/**
 * TODO description
 */
public class CommandLine {
	private final String EXAMPLESTRING = "2+3*5+(7*(8/2)+1)-(3+6+(5-2))";
	private final EquationInterpreter INTERPRETER = new EquationInterpreter(); 
	public CommandLine(){
		super(); 
		// create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    String inputStr = "";
	    String outputStr = "";
	    
	    //start the listing to the command line 
	    while(true){
		    System.out.print("enter q to close the application \n");
		    System.out.println("enter your equation: ");
		   inputStr = scanner.next().trim().toLowerCase();
		   if(inputStr.equals("q")){
			   System.exit(0);
		   }
		   INTERPRETER.interpretStr(inputStr);
		   System.out.println(inputStr);
	    }
	}
}