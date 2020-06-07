
package singleton.example.thread_safe;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("If you see same value, then singleton was created, If there are distinct values, then it is not working");
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}
	
	static class ThreadFoo implements Runnable{
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}
	}
	
	static class ThreadBar implements Runnable{
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}

}