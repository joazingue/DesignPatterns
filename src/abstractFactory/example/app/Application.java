
package abstractFactory.example.app;

import abstractFactory.example.buttons.Button;
import abstractFactory.example.checkboxes.Checkbox;
import abstractFactory.example.factories.GUIFactory;

/*
 * This application creates the objects according to the factory that will be passed
 */

public class Application {
	
	private Button btn;
	private Checkbox chkbox;
	
	public Application(GUIFactory factory) {
		btn = factory.createButton();
		chkbox = factory.createCheckbox();
	}
	
	public void paint() {
		btn.paint();
		chkbox.paint();
	}
}
