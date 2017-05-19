package main;

import java.util.HashMap;

import main.gui.GuiController;

public class ConstantManager {
	
	/*if[Pi]*/	
	private final String PI = "3.1415926"; 
	/*end[Pi]*/
	
	/*if[EN]*/	
	private final String EN = "2.71828";
	/*end[EN]*/
	
	/*if[SOS]*/	
	private final String SOS = "340.29";
	/*end[SOS]*/
	
	/*if[SOL]*/	
	private final String SOL = "299792458";
	/*end[SOL]*/
	
	/*if[GC]*/	
	private final String GC = "0.000000000067408";
	/*end[GC]*/
	
	
	public static ConstantManager INSTANCE = new ConstantManager();
	public final HashMap<String, String> map = new HashMap<String, String>();
	
	private ConstantManager(){
		super(); 
		/*if[Pi]*/	
		map.put("PI", PI);
		/*end[Pi]*/

		/*if[EN]*/	
		map.put("EN", EN);
		/*end[EN]*/
		
		/*if[SOS]*/	
		map.put("SOS", SOS);
		/*end[SOS]*/

		/*if[SOL]*/	
		map.put("SOL", SOL);
		/*end[SOL]*/

		/*if[GC]*/	
		map.put("GC", GC);
		/*end[GC]*/
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
