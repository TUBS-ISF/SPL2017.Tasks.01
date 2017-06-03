import java.util.HashMap;

public class ConstantManager {

	public final HashMap<String, String> map = new HashMap<String, String>();
	
	public ConstantManager(){
		initMap(); 
	}
	
	protected void initMap(){
		System.out.println("Initialize Map");
	}
	
	public HashMap<String, String> getMap(){
		return map;
	}
}
