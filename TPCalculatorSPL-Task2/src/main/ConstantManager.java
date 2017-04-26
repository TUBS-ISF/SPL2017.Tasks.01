package main;

import java.util.HashMap;

public class ConstantManager {
	
	private final String PI = "3.1415926"; 
	private final String EN = "2.71828";
	private final String SOS = "340.29";
	private final String SOL = "299792458";
	private final String GC = "0.000000000067408";
	
	public static ConstantManager INSTANCE = new ConstantManager();
	public final HashMap<String, String> map = new HashMap<String, String>();
	
	private ConstantManager(){
		super(); 
		map.put("PI", PI);
		map.put("EN", EN);
		map.put("SOS", SOS);
		map.put("SOL", SOL);
		map.put("GC", GC);
	}
	
	public static ConstantManager getInstance(){
		if(INSTANCE == null){
			INSTANCE = new ConstantManager();
		}
		return INSTANCE; 
	}
	
	public HashMap<String, String> getMap(){
		return map;
	}
	
	

	
	
	
	

}
