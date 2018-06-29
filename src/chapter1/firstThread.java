package chapter1;

class MyThread extends Thread {
	@Override
	public void run(){
		super.run();
		System.out.println("Mythread");
	}
}

public class firstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		myThread.start();
//		myThread.start();
		System.out.println("finished");
	}

}
