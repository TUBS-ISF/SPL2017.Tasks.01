import interfaces.IOperation;

public class Sin implements IOperation{

	@Override
	public double calculate(double param1) {
		return Math.sin(param1);
	}

	@Override
	public double calculate(double param1, double param2) {
		return 0;
	}

}
