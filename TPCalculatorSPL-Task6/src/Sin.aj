
public aspect Sin {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("SIN")){
//			System.out.println("SIN greift");
//			double solution = Math.tan(param1); 
//			proceed(op, param1,param2,solution); 
//		}
//	}
	
	before(): execution(void CalculationController.calculateOp()){
		calcSolution(); 
	}
	
	private void calcSolution(){
		double param1 = CalculationController.getInstance().getParam1();
		double result =  Math.sin(param1); 
		CalculationController.getInstance().setSolution("SIN", result);
	}
}
