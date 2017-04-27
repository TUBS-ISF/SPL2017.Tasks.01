package main.calculationLogic;

import java.util.Vector;

/**
 * provide methods to interpret a string 
 */
public class EquationInterpreter {

	
	public EquationInterpreter(){
		super(); 
	}
	
	public Vector<String> interpretStr(String str){
		Vector<String> outV = new Vector<String>();
		String command = str.replace(")", "");
		String[] parts = command.split("\\(");
		
		outV.add(parts[0]);
		String[] operands = str.split("\\;"); 
		for(int i = 0; i<operands.length; i++){
			outV.add(operands[i]); 
		}
		
		System.out.println("Werte: " + getOperands(parts[1]).toString()); 
		
		return outV;
	}
	
	private Vector<Double> getOperands(String str){
		Vector<Double> opsVec = new Vector<Double>(); 
		String[] operands = str.split("\\;"); 
		for(int i = 0; i<operands.length; i++){
			opsVec.add(Double.valueOf(operands[i])); 
		}
		return opsVec; 
	}
}



