package main;

public class ConstantManager {
	
	private final double PI = 3.1415926; 
	private final double EN = 2.71828;
	private final double SOS = 340.29;
	private final double SOL = 299792458;
	private final double GC = 0.000000000067408;
	
	public final static ConstantManager INSTANCE = new ConstantManager(); 
	
	private ConstantManager(){
		super(); 
	}
	
	public static ConstantManager getInstance(){
		return INSTANCE; 
	}

	public double getPI() {
		return PI;
	}

	public double getEN() {
		return EN;
	}

	public double getSOS() {
		return SOS;
	}

	public double getSOL() {
		return SOL;
	}

	public double getGC() {
		return GC;
	}

	public ConstantManager getINSTANCE() {
		return INSTANCE;
	}
	
	
	

}
