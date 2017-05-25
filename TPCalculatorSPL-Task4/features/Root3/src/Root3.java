import interfaces.IOperation;

public class Root3 implements IOperation{
	@Override
	public double calculate(double param1) {
		double solution = 0.0; 
		if(param1 >= 0){
			solution = Math.pow(param1, (1.0/3.0)); 
		}
		return solution; 
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}
}
