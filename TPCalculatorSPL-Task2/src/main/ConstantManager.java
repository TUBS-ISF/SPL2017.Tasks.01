package main;

import java.util.HashMap;

import properties.PropertyManager;

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
		if(PropertyManager.getProperty("Pi")){
			map.put("PI", PI);
		}
		if(PropertyManager.getProperty("EN")){
			map.put("EN", EN);
		}
		if(PropertyManager.getProperty("SOS")){
			map.put("SOS", SOS);
		}
		if(PropertyManager.getProperty("SOL")){
			map.put("SOL", SOL);
		}
		if(PropertyManager.getProperty("GC")){
			map.put("GC", GC);
		}
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
