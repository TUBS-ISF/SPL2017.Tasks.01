
public aspect Sqrt {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("ROOT2")){
//			double solution = 0;
//			if(param1 >= 0){
//				System.out.println("ROOT2 greift");
//				solution = Math.sqrt(param1);
//				proceed(op, param1,param2,solution); 
//			}
//	}
//	}
}
