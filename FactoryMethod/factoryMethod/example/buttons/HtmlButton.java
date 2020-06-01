
package factoryMethod.example.buttons;

public class HtmlButton implements Button{

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("Click! HTML Button says - 'Hello World!'");
	}

}
