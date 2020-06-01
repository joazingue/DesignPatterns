
package factoryMethod.example;

import factoryMethod.example.factory.Dialog;
import factoryMethod.example.factory.HtmlDialog;
import factoryMethod.example.factory.WindowsDialog;

public class Demo {
	
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	static void configure() {
		String os = System.getProperty("os.name");
		if(os.equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
			
	}
	
	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
