package main.cli;

import java.util.Scanner;

import main.ConstantManager;
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
	    
	    //start the listing to the command line 
	    while(true){
		    System.out.print("enter q to close the application \n");
		    System.out.println("enter a comand like \"add x y\" : ");
		   inputStr = scanner.next().trim().toLowerCase();
		   if(inputStr.equals("q")){
			   System.exit(0);
		   }
		   /**
		    * TODO: find a good possibility to check for invalid input parameters.
		    */
		   String[] commandArray = interpret(inputStr);
		   
		   System.out.println(calcLogic.calculate(commandArray));
	    }
	}
	
	private String[] interpret(String command){
		String[] commandArray = command.split(" ");
		for(int i = 0; i<commandArray.length; i++){
			commandArray[i] = checkForConst(commandArray[i]);
		}
		return commandArray; 
	}
	
	private String checkForConst(String param){
		String value = param; 
		if(ConstantManager.getInstance().getMap().keySet().contains(param.toUpperCase())){
			value = ConstantManager.getInstance().getMap().get(param); 
		}
		try{
			Double.valueOf(value);
		}
		catch(NumberFormatException nfe){
			System.out.println("Your Input was: " + value + "This Constant is not support in your Product.");
		}
		return value;
	}
	
}