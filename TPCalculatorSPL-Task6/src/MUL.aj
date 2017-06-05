
public aspect MUL {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("MUL")){
//			System.out.println("MUL greift");
//			double solution = param1 * param2;
//			proceed(op, param1,param2,solution); 
//		}
//	}
	
	before(): execution(void CalculationController.calculateOp()){
		calcSolution(); 
	}
	
	private void calcSolution(){
		double param1 = CalculationController.getInstance().getParam1();
		double param2 = CalculationController.getInstance().getParam2(); 
		double result =  param1 * param2 ; 
		CalculationController.getInstance().setSolution("MUL", result);
	}
}
