package main;

import java.util.HashMap;
import java.util.List;

import interfaces.IOperation;
import loader.PluginLoader;

public class CalculationLogic {

	private final HashMap<String, IOperation> opsMap = new HashMap<String,IOperation >();
	private String operation = "DEFAULT"; 
	private double param1 = 0;
	private double param2 = 0;
	private double solution = 0;
	
	public CalculationLogic(){
		
		List<IOperation> OpsPlugins = PluginLoader.load(IOperation.class);
		for(IOperation ops : OpsPlugins){
			String key = ops.getClass().getName().toUpperCase(); 
			opsMap.put(key, ops); 
		}
		
	}
	
	public String calculate(String[] content){
		solution = 0; 
		if(content.length >= 1){
			operation = content[0].toUpperCase();
		}
		if(content.length >= 2){
			try{
				param1 = Double.valueOf(content[1].trim()); 
			}
			catch(Exception e){
				System.out.println("Could not parse param1: " + content[1]);
			}
		}
		if(content.length >= 3){
			try{
				param2 = Double.valueOf(content[2].trim()); 
			}
			catch(Exception e){
				System.out.println("Could not parse param2" + content[2]);
			}
		}
		
		calculateOp();
		return String.valueOf(solution); 
	}
	
	private void calculateOp(){
		switch(operation){
		case "ADD":
		case "SUB":
		case "MUL":
		case "DIV":
			System.out.println("Claculate: " + param1 + " " + operation + " " + param2);
			solution = opsMap.get(operation).calculate(param1, param2); 
		break;
		case "POW2":
		case "POW3":
		case "POW4":
		case "ROOT2":
		case "ROOT3":
		case "TAN":
		case "SIN":
		case "COS":
			System.out.println("Claculate: " + operation + " " + param1);
			solution = opsMap.get(operation).calculate(param1);
		break;
		default:
			solution = 0; 
		}		
	}
}
