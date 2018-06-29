package chapter1;

class MyThread1 extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				int time = (int) (Math.random()*1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 myThread = new MyThread1();
		myThread.setName("myThread"); 
		myThread.start();
		try {
			for(int i = 0; i < 10; i++) {
				int time = (int) (Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
