import interfaces.IOperation;

public class Pow4 implements IOperation{
	@Override
	public double calculate(double param1) {
		return Math.pow(param1,4);
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}
}
