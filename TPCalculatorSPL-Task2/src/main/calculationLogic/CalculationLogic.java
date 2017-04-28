package main.calculationLogic;

import properties.PropertyManager;

public class CalculationLogic {
	
	private String operation = "DEFAULT"; 
	private double param1 = 0;
	private double param2 = 0;
	private double solutio = 0; 
	
	public CalculationLogic(){
		
	}
	
	public String calculate(String[] content){
		for(int i = 0; i<content.length; i++){
			System.out.println("Inhalt: " + content[i]);
		}
		
		if(content.length >= 1){
			operation = content[0];
		}
		if(content.length >= 2){
			try{
				param1 = Double.valueOf(content[1]); 
			}
			catch(Exception e){
				System.out.println("Erorr uccured");
			}
			
		}
		if(content.length >= 3){
			try{
				param2 = Double.valueOf(content[2]); 
			}
			catch(Exception e){
				System.out.println("Erorr uccured");
			}
		}
		calculateOp();
		return String.valueOf(solutio); 
	}
	
	private void errorMessage(){
		System.out.println("This Feature is not integrated in your Program");
	}
	
	private void calculateOp(){
		switch(operation){
		case "ADD":
			if(PropertyManager.getProperty("ADD")){
				solutio = param1 + param2;
			}
			else{
				errorMessage();
			}
			break;
		case "SUB":
			if(PropertyManager.getProperty("SUB")){
				solutio = param1 - param2;
			}
			else{
				errorMessage();
			}
			break;
		case "MUL":
			if(PropertyManager.getProperty("MUL")){
				solutio = param1 * param2;
			}
			else{
				errorMessage();
			}
			break;
		case "DIV":
			if(PropertyManager.getProperty("DIV")){
				if(param2 != 0){
					solutio = param1 / param2; 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "POW2":
			if(PropertyManager.getProperty("P2O")){
				solutio = Math.pow(param1, 2); 
			}
			else{
				errorMessage();
			}
			break;
		case "POW3":
			if(PropertyManager.getProperty("P3O")){
				solutio = Math.pow(param1, 3);
			}
			else{
				errorMessage();
			}
			break;
		case "POW4":
			if(PropertyManager.getProperty("P4O")){
				solutio = Math.pow(param1, 4);
			}
			else{
				errorMessage();
			}
			break;
		case "ROOT2":
			if(PropertyManager.getProperty("Sqrt")){
				if(param1 >= 0){
					solutio = Math.sqrt(param1); 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "ROOT3":
			if(PropertyManager.getProperty("Root3")){
				if(param1 >= 0){
					solutio = Math.pow(param1, (1 / 3)); 
				}
			}
			else{
				errorMessage();
			}
			break;
		case "TAN":
			if(PropertyManager.getProperty("Tan")){
				solutio = Math.tan(param1); 
			}
			else{
				errorMessage();
			}
			break;
		case "SIN":
			if(PropertyManager.getProperty("Sin")){
				solutio = Math.sin(param1);
			}
			else{
				errorMessage();
			}
			break;
		case "COS":
			if(PropertyManager.getProperty("Cos")){
				solutio = Math.cos(param1);
			}
			else{
				errorMessage();
			}
			break;
		default:
			solutio = 0; 
		}		

	}

}
