public aspect EN {

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
		ConstantManager.getInstance().getMap().put("EN","2.71828"); 
	}
}
