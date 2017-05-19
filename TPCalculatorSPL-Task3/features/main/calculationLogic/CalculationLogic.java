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
			/*if[ADD]*/	
			solution = param1 + param2;
			/*end[ADD]*/
		break;
		case "SUB":
			/*if[SUB]*/	
			solution = param1 - param2;
			/*end[SUB]*/
		break;
		case "MUL":
			/*if[MUL]*/	
			solution = param1 * param2;
			/*end[MUL]*/
		break;
		case "DIV":
			/*if[DIV]*/	
			if(param2 != 0){
				solution = param1 / param2; 
			}
			/*end[DIV]*/	
		break;
		case "POW2":
			/*if[P2O]*/	
			solution = Math.pow(param1, 2);
			/*end[P2O]*/
		break;
		case "POW3":
			/*if[P30]*/	
			solution = Math.pow(param1, 3);
			/*end[P3O]*/
		break;
		case "POW4":
			/*if[P4O]*/	
			solution = Math.pow(param1, 4);
			/*end[P4O]*/
		break;
		case "ROOT2":
			/*if[Sqrt]*/	
			if(param1 >= 0){
				solution = Math.sqrt(param1); 
			}
			/*end[Sqrt]*/
		break;
		case "ROOT3":
			/*if[Root3]*/	
			if(param1 >= 0){
				solution = Math.pow(param1, (1.0/3.0)); 
			}
			/*end[Root3]*/
		break;
		case "TAN":
			/*if[Tan]*/	
			solution = Math.tan(param1);
			/*end[Tan]*/
		break;
		case "SIN":
			/*if[Sin]*/	
			solution = Math.sin(param1);	
			/*end[Sin]*/
		break;
		case "COS":
			/*if[Cos]*/	
			solution = Math.cos(param1);
			/*end[Cos]*/
		break;
		default:
			solution = 0; 
		}		

	}

}
