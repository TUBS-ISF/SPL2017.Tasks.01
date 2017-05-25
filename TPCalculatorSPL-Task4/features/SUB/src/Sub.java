import interfaces.IOperation;

public class Sub implements IOperation{

	@Override
	public double calculate(double param1) {
		return 0;
	}

	@Override
	public double calculate(double param1, double param2) {
		return param1 - param2;
	}

}
