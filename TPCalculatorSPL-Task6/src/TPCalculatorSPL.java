
public class TPCalculatorSPL {

	public TPCalculatorSPL() {
		System.out.println("System start");
	}
	
	private void initUi(){
		System.out.println("initialize UI");
	}
	
	public static void main(String[] args) {
		TPCalculatorSPL application = new TPCalculatorSPL();
		application.initUi();
	}

}
