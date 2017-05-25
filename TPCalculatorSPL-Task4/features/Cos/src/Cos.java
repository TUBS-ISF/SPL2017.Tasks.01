import interfaces.IOperation;

public class Cos implements IOperation{

	@Override
	public double calculate(double param1) {
		return Math.cos(param1);
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}

}
