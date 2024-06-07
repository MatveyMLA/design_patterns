package singleton;

public class Main {

	public static void main(String[] args) {
		
		var single = Singleton.getInstance();
		System.out.println(single + " " + Singleton.getInstancesAmount());
		var single2 = Singleton.getInstance();
		System.out.println(single2 + " " + Singleton.getInstancesAmount());
		var single3 = Singleton.getInstance();
		System.out.println(single3 + " " + Singleton.getInstancesAmount());
		var single4 = Singleton.getInstance();
		System.out.println(single4 + " " + Singleton.getInstancesAmount());
		var single5 = Singleton.getInstance();
		System.out.println(single5 + " " + Singleton.getInstancesAmount());
		var single6 = Singleton.getInstance();
		System.out.println(single6 + " " + Singleton.getInstancesAmount());
		var single7 = Singleton.getInstance();
		System.out.println(single7 + " " + Singleton.getInstancesAmount());
		var single8 = Singleton.getInstance();
		System.out.println(single8 + " " + Singleton.getInstancesAmount());
		var single9 = Singleton.getInstance();
		System.out.println(single9 + " " + Singleton.getInstancesAmount());
		var single10 = Singleton.getInstance();
		System.out.println(single10 + " " + Singleton.getInstancesAmount());
		
		
		var mono = MonoSingleton.getInstance();
		var mono1 = MonoSingleton.getInstance();		
		System.out.println(mono);
		System.out.println(mono1);
		
		
	}

}
