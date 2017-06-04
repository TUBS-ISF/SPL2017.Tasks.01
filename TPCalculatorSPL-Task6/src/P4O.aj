
public aspect P4O {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("POW4")){
//			System.out.println("POW4 greift");
//			double solution = solution = Math.pow(param1, 4);
//			proceed(op, param1,param2,solution); 
//		}
//	}
}
