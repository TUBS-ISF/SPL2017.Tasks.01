import java.util.HashMap;

public class CalculationController {
	private String operation = "DEFAULT"; 
	private double param1 = 0;
	private double param2 = 0;
	private double solution = 0; 
	
	private HashMap<String, Double> solutionMap = new HashMap<String, Double>(); 
	public static CalculationController instance = null; 
	
	public CalculationController(){
		instance = this; 
		solutionMap.put("DEFAULT", 0.0); 
	}
	
	public static CalculationController getInstance(){
		return instance; 
	}
	
	public void setSolution(String key, Double solution){
		solutionMap.put(key, solution); 
	}
	
	public String getOperation(){
		return operation; 
	}
	
	public double getParam1(){
		return param1; 
	}
	
	public double getParam2(){
		return param2; 
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
	
//	void setSolution(String op, double param1, double param2, double result){
//		 solution = result; 
//	}
	
	private void calculateOp(){
//		double result = 0; 
//		setSolution(operation, param1, param2, result); 
		
		if(solutionMap.containsKey(operation)){
			solution = solutionMap.get(operation);
		}
		else{
			solution = solutionMap.get("DEFAULT");
			errorMessage();
		}
		 
//		switch(operation){
//		case "ADD":
//			solution = param1 + param2;
//		break;
//		case "SUB":
//			solution = param1 - param2;
//		break;
//		case "MUL":
//			solution = param1 * param2;
//		break;
//		case "DIV":
//			if(param2 != 0){
//				solution = param1 / param2; 
//			}
//		break;
//		case "POW2":
//			solution = Math.pow(param1, 2);
//		break;
//		case "POW3":
//			solution = Math.pow(param1, 3);
//		break;
//		case "POW4":
//			solution = Math.pow(param1, 4);
//		break;
//		case "ROOT2":
//			if(param1 >= 0){
//				solution = Math.sqrt(param1); 
//			}
//		break;
//		case "ROOT3":
//			if(param1 >= 0){
//				solution = Math.pow(param1, (1.0/3.0)); 
//			}
//		break;
//		case "TAN":
//			solution = Math.tan(param1);
//		break;
//		case "SIN":
//			solution = Math.sin(param1);	
//		break;
//		case "COS":
//			solution = Math.cos(param1);
//		break;
//		default:
//			solution = 0; 
//		}		

	}

}
