public aspect GC {

//	declare precedence: World, Wonderful; 

	pointcut setConst(String key, String value): 
		execution(void ConstantManager.setConst(String,String)) && args(key,value); 
	
	void around(String key, String value): setConst(key, value) {
		System.out.println("PI greift");
		proceed("Pi","3.1415926"); 
	}
	
	after(): execution(public ConstantManager.new()){
		setMap(); 
	}
	
	private void setMap(){
		ConstantManager.getInstance().getMap().put("GC","0.000000000067408"); 
	}
}