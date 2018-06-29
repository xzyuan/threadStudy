//使用异常打断线程运行

package chapter1;

class MyThread05 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			for (int i = 0; i < 1000000; i++) {
				if(this.interrupted()) {
					throw new InterruptedException();
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println("exception quit");
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}

public class threadStopDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread05 myThread05 = new MyThread05();
		try {
			myThread05.start();
			Thread.sleep(2000);
			myThread05.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
