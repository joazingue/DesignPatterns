
package abstractFactory.example.buttons;

/*
 * Each family of products have it's implementation
 * This is the Button implementation for MacOS
 */

public class MacOSButton implements Button {

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Mac OS button created");		
	}

}
