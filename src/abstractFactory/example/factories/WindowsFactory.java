
package abstractFactory.example.factories;

import abstractFactory.example.buttons.Button;
import abstractFactory.example.buttons.WindowsButton;
import abstractFactory.example.checkboxes.Checkbox;
import abstractFactory.example.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
	
	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}
	
	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
