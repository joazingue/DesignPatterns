
package singleton.example.non_thread_safe;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("If you see same value, then singleton was created, If there are distinct values, then it is not working");
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton another = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(another.value);
	}

}
