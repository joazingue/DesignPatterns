
package factoryMethod.example.factory;

import factoryMethod.example.buttons.Button;
import factoryMethod.example.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
