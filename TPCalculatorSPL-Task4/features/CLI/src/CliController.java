import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import interfaces.IConstant;
import interfaces.IOperation;
import loader.PluginLoader;
import main.CalculationLogic;
import main.TPCalculator;


public class CliController implements interfaces.IUi{

	private  HashMap<String, IConstant> constantMap = new HashMap<String, IConstant>();
	private CalculationLogic calcLogic = new CalculationLogic(); 
	
	@Override
	public void init() {
		List<IConstant> ConstPlugins = PluginLoader.load(IConstant.class);
		initConstants(ConstPlugins);
		
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
	
	private void initConstants(List<IConstant> list){
		for(IConstant constant : list){
			String key = constant.getClass().getName().toUpperCase(); 
			constantMap.put(key, constant); 
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
		if(constantMap.containsKey(value.toUpperCase())){
			value = constantMap.get(param.toUpperCase()).getValue(); 
		}
		try{
			Double.valueOf(value);
		}
		catch(NumberFormatException nfe){
		}
		return value;
	}

}
