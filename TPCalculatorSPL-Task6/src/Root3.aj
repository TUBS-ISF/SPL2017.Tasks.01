
public aspect Root3 {
//	pointcut setSolutionAdvice(String op, double param1, double param2, double result): 
//		execution(void CalculationController.setSolution(String,double, double,double)) && args(op, param1, param2, result); 
//	
//	void around(String op, double param1, double param2, double result): setSolutionAdvice(op, param1, param2, result) {
//		if(op.equals("ROOT3")){
//			double solution = 0;
//			if(param1 >= 0){
//				System.out.println("ROOT3 greift");
//				solution = Math.pow(param1, (1.0/3.0));
//				proceed(op, param1,param2,solution); 
//			}
//		}
//	}
}
