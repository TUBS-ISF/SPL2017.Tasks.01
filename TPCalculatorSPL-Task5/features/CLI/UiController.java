import java.util.Scanner;


public class UiController {
	
	private CalculationLogic calcLogic = new CalculationLogic();
	private ConstantManager constManager = new ConstantManager(); 
	
	public UiController(){
		initUi(); 
	}
	
	protected void initUi(){
		System.out.println("Hello Cli");
		// create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    String inputStr = "";
	    
	    //start the listing to the command line
	    System.out.print("enter q to close the application \n");
	    System.out.println("enter a comand like \"add#x#y\" : ");
	    while(true){
		   inputStr = scanner.next().toLowerCase();
		   if(inputStr.equals("q")){
			   System.exit(0);
		   }
		   String[] commandArray = interpret(inputStr);
		   
		   System.out.println(calcLogic.calculate(commandArray));
		   
	    }
	}
	
	private String[] interpret(String command){
		String[] commandArray = command.split("\\#");
		for(int i = 1; i<commandArray.length; i++){
			commandArray[i] = checkForConst(commandArray[i]);
		}
		return commandArray; 
	}
	
	private String checkForConst(String param){
		String value = param; 
		if(constManager.getMap().keySet().contains(param.toUpperCase())){
			value = constManager.getMap().get(param.toUpperCase()); 
		}
		try{
			Double.valueOf(value);
		}
		catch(NumberFormatException nfe){
		}
		return value;
	}
}
