import interfaces.IConstant;

public class En implements IConstant{

	@Override
	public String getValue() {
		return String.valueOf(Math.E);
	}

}
