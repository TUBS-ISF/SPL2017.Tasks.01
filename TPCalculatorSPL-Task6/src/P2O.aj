
public aspect P2O {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("POW2")){
//			System.out.println("POW2 greift");
//			double solution = solution = Math.pow(param1, 2);
//			proceed(op, param1,param2,solution); 
//		}
//	}
	
	before(): execution(void CalculationController.calculateOp()){
		calcSolution(); 
	}
	
	private void calcSolution(){
		double param1 = CalculationController.getInstance().getParam1();
		double result =  Math.pow(param1, 2); 
		CalculationController.getInstance().setSolution("POW2", result);
	}
}
