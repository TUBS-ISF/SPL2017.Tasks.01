import interfaces.IOperation;

public class Div implements IOperation{
	@Override
	public double calculate(double param1) {
		return 0.0; 
	}

	@Override
	public double calculate(double param1, double param2) {
		double solution = 0.0; 
		if(param2 != 0){
			solution = param1 / param2;  
		}
		return solution; 
	}
}
