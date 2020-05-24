
package abstractFactory.example.factories;

import abstractFactory.example.buttons.Button;
import abstractFactory.example.buttons.MacOSButton;
import abstractFactory.example.checkboxes.Checkbox;
import abstractFactory.example.checkboxes.MacOSCheckbox;

/*
 * Factory to create MacOS objects
 */
public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}
	
	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}
}
