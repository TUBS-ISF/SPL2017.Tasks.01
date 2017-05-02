package main.calculationLogic;

import properties.PropertyManager;

public class CalculationLogic {
	
	private String operation = "DEFAULT"; 
	private double param1 = 0;
	private double param2 = 0;
	private double solution = 0; 
	
	public CalculationLogic(){
		
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
	
	private void errorMessage(){
		System.out.println("This Feature is not integrated in your Program. Therefore the solution is 0.0");
	}
	
	private void calculateOp(){
		switch(operation){
		case "ADD":
			if(PropertyManager.getProperty("ADD")){
				solution = param1 + param2;
			}
			else{
				errorMessage();
			}
			break;
		case "SUB":
			if(PropertyManager.getProperty("SUB")){
				solution = param1 - param2;
			}
			else{
				errorMessage();
			}
			break;
		case "MUL":
			if(PropertyManager.getProperty("MUL")){
				solution = param1 * param2;
			}
			else{
				errorMessage();
			}
			break;
		case "DIV":
			if(PropertyManager.getProperty("DIV")){
				if(param2 != 0){
					solution = param1 / param2; 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "POW2":
			if(PropertyManager.getProperty("P2O")){
				solution = Math.pow(param1, 2); 
			}
			else{
				errorMessage();
			}
			break;
		case "POW3":
			if(PropertyManager.getProperty("P3O")){
				solution = Math.pow(param1, 3);
			}
			else{
				errorMessage();
			}
			break;
		case "POW4":
			if(PropertyManager.getProperty("P4O")){
				solution = Math.pow(param1, 4);
			}
			else{
				errorMessage();
			}
			break;
		case "ROOT2":
			if(PropertyManager.getProperty("Sqrt")){
				if(param1 >= 0){
					solution = Math.sqrt(param1); 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "ROOT3":
			if(PropertyManager.getProperty("Root3")){
				if(param1 >= 0){
					solution = Math.pow(param1, (1.0/3.0)); 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "TAN":
			if(PropertyManager.getProperty("Tan")){
				solution = Math.tan(param1); 
			}
			else{
				errorMessage();
			}
			break;
		case "SIN":
			if(PropertyManager.getProperty("Sin")){
				solution = Math.sin(param1);
			}
			else{
				errorMessage();
			}
			break;
		case "COS":
			if(PropertyManager.getProperty("Cos")){
				solution = Math.cos(param1);
			}
			else{
				errorMessage();
			}
			break;
		default:
			solution = 0; 
		}		

	}

}
