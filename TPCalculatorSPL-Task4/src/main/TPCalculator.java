package main;

import java.util.HashMap;
import java.util.List;

import interfaces.IConstant;
import interfaces.IOperation;
import interfaces.IUi;
import loader.PluginLoader;
/**
 * 
 * @author Tobias Pett
 */
public class TPCalculator {

	private TPCalculator() {
		System.out.println("start");
						
		List<IUi> UiPlugins = PluginLoader.load(IUi.class);
		initUi(UiPlugins);
	}
	
	private void initUi(List<IUi> list){
		for(IUi ui : list){
			ui.init();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TPCalculator calc = new TPCalculator();   
	}


}
