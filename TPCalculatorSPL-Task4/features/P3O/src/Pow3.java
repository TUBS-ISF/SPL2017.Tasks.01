import interfaces.IOperation;

public class Pow3 implements IOperation{

	@Override
	public double calculate(double param1) {
		return Math.pow(param1,3);
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}
}
