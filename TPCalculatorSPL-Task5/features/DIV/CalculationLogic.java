
public class CalculationLogic {
	
	private String operation = "DEFAULT"; 
	private double param1 = 0;
	private double param2 = 0;
	private double solution = 0;
	
	protected void calculateOp(){
		original(); 
		if(operation.equals("DIV")){
			if(param2 != 0){
				solution = param1 / param2; 
			}
		}
	}
}
