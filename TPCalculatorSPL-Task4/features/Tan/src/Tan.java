import interfaces.IOperation;

public class Tan implements IOperation{

	@Override
	public double calculate(double param1) {
		return Math.tan(param1);
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}
	
}
