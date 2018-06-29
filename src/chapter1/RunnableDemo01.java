//使用Thread类的对象传入Thread(Runnable target)中

package chapter1;

class MyThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("running");
	}
}

public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		Thread thread2 = new Thread(thread);
		thread2.start();
		System.out.println("finished");
	}
}
