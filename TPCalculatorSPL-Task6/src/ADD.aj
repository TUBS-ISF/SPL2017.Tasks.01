
public aspect ADD {
//	pointcut setSolutionAdviceADD(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	declare precedence: SUB, ADD;
//	void around(String op, double param1, double param2, double result): setSolutionAdviceADD(op, param1, param2, result) {
//		if(op.equals("ADD")){
//			System.out.println("ADD greift");
//			double solution = param1 + param2;
//			System.out.println(solution);
//			proceed(op, param1,param2,solution); 
//		}
//	}
	
	before(): execution(void CalculationController.calculateOp()){
		calcSolution(); 
	}
	
	private void calcSolution(){
		double param1 = CalculationController.getInstance().getParam1();
		double param2 = CalculationController.getInstance().getParam2(); 
		double result =  param1 + param2 ; 
		CalculationController.getInstance().setSolution("ADD", result);
	}
}
