package singleton;

public class Singleton {
	// 创建类的对象
	private static Singleton instance = null;

	// 创建无参构造方法
	private Singleton() {

	}

	// 创建公有类静态方法
	public synchronized static Singleton getInstance() {
		
		if (null == instance) {
			return new Singleton();
		}
		
		return instance;
	}

}
