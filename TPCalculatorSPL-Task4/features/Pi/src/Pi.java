import interfaces.IConstant;

public class Pi implements IConstant{

	@Override
	public String getValue() {
		return String.valueOf(Math.PI);
	}
	
}
