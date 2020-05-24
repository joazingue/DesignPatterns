
package abstractFactory.example.factories;

import abstractFactory.example.buttons.Button;
import abstractFactory.example.checkboxes.Checkbox;

/*
 * This interface know the family types to be created
 */

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();

}
