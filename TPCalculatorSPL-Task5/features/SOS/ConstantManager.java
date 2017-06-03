import java.util.HashMap;

public class ConstantManager {

	
	public final HashMap<String, String> map = new HashMap<String, String>();
	
	protected void initMap(){
		original(); 
		map.put("SOS", "340.29"); 
	}
	
}
