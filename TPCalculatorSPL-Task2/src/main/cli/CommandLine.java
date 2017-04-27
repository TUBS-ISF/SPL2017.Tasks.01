package main.cli;

import java.util.Scanner;

import main.calculationLogic.CalculationLogic;

/**
 * TODO description
 */
public class CommandLine {
	private CalculationLogic calcLogic = new CalculationLogic(); 
//	private String[] commandArray = new String[6]; 
	public CommandLine(){
		super(); 
		// create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    String inputStr = "";
	    String outputStr = "";
	    
	    //start the listing to the command line 
	    while(true){
		    System.out.print("enter q to close the application \n");
		    System.out.println("enter a comand like \"add x y\" : ");
		   inputStr = scanner.next().trim().toLowerCase();
		   if(inputStr.equals("q")){
			   System.exit(0);
		   }
		   String[] commandArray = interpret(inputStr);
		   
		   System.out.println(calcLogic.calculate(commandArray));
	    }
	}
	
	private String[] interpret(String command){
		String[] commandArray = command.split(" ");
		
		return commandArray; 
	}
	
}