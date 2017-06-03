
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
	
	protected void calculateOp(){
		solution = 0; 
	}

}
