import java.util.Scanner;

public aspect CLI {
	private CalculationController calcLogic = new CalculationController();
	private ConstantManager CM = null; 
	
//	/**
//	 * Constructor
//	 */
//	public CLI(){
//		System.out.println("Hello Cli");
//		// create a scanner so we can read the command-line input
//	    Scanner scanner = new Scanner(System.in);
//
//	    String inputStr = "";
//	    
//	    //start the listing to the command line
//	    System.out.print("enter q to close the application \n");
//	    System.out.println("enter a comand like \"add#x#y\" : ");
//	    while(true){
//		   inputStr = scanner.next().toLowerCase();
//		   if(inputStr.equals("q")){
//			   System.exit(0);
//		   }
//		   String[] commandArray = interpret(inputStr);
//		   
//		   System.out.println(calcLogic.calculate(commandArray));
//		   
//	    }
//	}
	
	after(): execution(void TPCalculatorSPL.initUi()){
		startCli(); 
	}
	
	private void startCli(){
		System.out.println("Hello Cli");
		CM = new ConstantManager();
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
		if(CM.getMap().keySet().contains(param.toUpperCase())){
			value = CM.getMap().get(param.toUpperCase()); 
		}
		try{
			Double.valueOf(value);
		}
		catch(NumberFormatException nfe){
		}
		return value;
	}
	
}
