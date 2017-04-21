package shixzh.biw.costomize.thread;

/**
 * 三个售票窗口同时出售20张票;
 * 程序分析：
 * 1.票数要使用同一个静态值
 * 2.为保证不会出现卖出同一个票数，要java多线程同步锁。
 * 设计思路：
 * 1.创建一个窗口类TicketWindowThread，继承Thread，重写run方法，
 * 在run方法里面执行售票操作！售票要使用同步锁：
 * 即有一个窗口卖这张票时，其他窗口要等这张票卖完！
 * 2.创建主方法调用类
 * @author zsmx
 *
 */
public class TicketWindow extends Thread {

	static int ticket = 20;
	static Object ob = "key";

	public TicketWindow(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (ticket > 0) {
			// 使用一个锁，进去的人会把钥匙拿在手上，出来后才把钥匙让出来
			synchronized (ob) {
				if (ticket > 0) {
					System.out.println(this.getName() 
							+ "卖出来第 " + ticket + " 张！");
					ticket--;
				} else {
					System.out.println("已售完！");
				}
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
