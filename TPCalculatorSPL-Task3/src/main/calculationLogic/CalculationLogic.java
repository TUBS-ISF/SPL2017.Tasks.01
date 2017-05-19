package main.calculationLogic;

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
				
			solution = param1 + param2;
			
		break;
		case "SUB":
				
			solution = param1 - param2;
			
		break;
		case "MUL":
				
			solution = param1 * param2;
			
		break;
		case "DIV":
				
			if(param2 != 0){
				solution = param1 / param2; 
			}
				
		break;
		case "POW2":
				
			solution = Math.pow(param1, 2);
			
		break;
		case "POW3":
			


		break;
		case "POW4":
			


		break;
		case "ROOT2":
				
			if(param1 >= 0){
				solution = Math.sqrt(param1); 
			}
			
		break;
		case "ROOT3":
			




		break;
		case "TAN":
				
			solution = Math.tan(param1);
			
		break;
		case "SIN":
				
			solution = Math.sin(param1);	
			
		break;
		case "COS":
				
			solution = Math.cos(param1);
			
		break;
		default:
			solution = 0; 
		}		

	}

}
