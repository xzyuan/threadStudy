//不共享数据

package chapter1;

class MyThread3 extends Thread{
	int count = 5;
	public MyThread3(String name) {
		super();
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		count--;
		System.out.println(Thread.currentThread().getName() + "  count = " + count);
	}
}

public class threadDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 a = new MyThread3("A");
		MyThread3 b = new MyThread3("B");
		MyThread3 c = new MyThread3("C");
		a.start();
		b.start();
		c.start();
	}

}
