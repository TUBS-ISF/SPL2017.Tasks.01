
public aspect DIV {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("DIV")){
//			double solution = 0;
//			if(param2 != 0){
//				System.out.println("DIV greift");
//				solution = param1 / param2;
//				proceed(op, param1,param2,solution);
//			}
//		}
//	}
	
	
	before(): execution(void CalculationController.calculateOp()){
		calcSolution(); 
	}
	
	private void calcSolution(){
		double param1 = CalculationController.getInstance().getParam1();
		double param2 = CalculationController.getInstance().getParam2();
		double result = 0;
		if(param2 != 0){
			result = param1 / param2; 
		}
		 
		CalculationController.getInstance().setSolution("DIV", result);
	}
}
