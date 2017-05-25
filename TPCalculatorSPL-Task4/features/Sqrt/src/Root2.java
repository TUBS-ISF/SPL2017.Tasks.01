import interfaces.IOperation;

public class Root2 implements IOperation{

	@Override
	public double calculate(double param1) {
		double solution = 0.0; 
		if(param1 >= 0){
			solution = Math.sqrt(param1); 
		}		
		return solution;
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}
	
}
