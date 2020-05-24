
package abstractFactory.example;

import abstractFactory.example.app.Application;
import abstractFactory.example.factories.GUIFactory;
import abstractFactory.example.factories.MacOSFactory;
import abstractFactory.example.factories.WindowsFactory;

public class Demo {
	
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
	
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} 
		else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		return app;
	}

}
