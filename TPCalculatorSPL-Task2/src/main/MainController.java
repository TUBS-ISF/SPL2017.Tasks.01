package main;

/**
 * Singleton implementation of a controller Module to connect logical functionality 
 * with the user interface view components
 */
public class MainController {
	
	public MainController INSTANCE = null; 
	
	private MainController(){
		
	}
	
	/**
	 * Method to get the MainController instance. 
	 * If MainController was not called before build a new object.  
	 * @return Instance of the MainController.
	 */
	public MainController getInstance(){
		if(INSTANCE == null){
			INSTANCE = new MainController(); 
		}
		return INSTANCE; 
	}
	
	
}