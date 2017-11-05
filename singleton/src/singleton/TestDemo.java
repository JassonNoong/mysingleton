package singleton;

public class TestDemo extends Thread{
	public void run() {
		int s1 =Singleton.getInstance().hashCode();
		System.out.println(s1);
	}
	
	
	public static void main(String[] args) {
		TestDemo[] demo =new TestDemo[2000];
		for(int i =0;i<demo.length;i++) {
			demo[i]=new TestDemo();
		}
		
		for(int i =0;i<demo.length;i++) {
			demo[i].start();
		}
	}
}
