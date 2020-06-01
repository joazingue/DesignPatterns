
package factoryMethod.example.factory;

import factoryMethod.example.buttons.Button;
import factoryMethod.example.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new HtmlButton();
	}

}
