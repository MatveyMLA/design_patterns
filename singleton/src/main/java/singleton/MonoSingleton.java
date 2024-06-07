package singleton;

public class MonoSingleton {

	private static MonoSingleton instance = new MonoSingleton();
	
	private MonoSingleton() {}
	
	public static MonoSingleton getInstance() {
		return instance;
	}
	
}
