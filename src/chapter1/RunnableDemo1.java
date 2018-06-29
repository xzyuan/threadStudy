package chapter1;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("running");
	}
}

public class RunnableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runnable runnable = new MyRunnable();
	Thread thread = new Thread(runnable,"thread1");
	thread.start();
	System.out.println("finished");
	}

}
