package shixzh.biw.costomize.thread;

public class ThreadAddSubTest extends Thread {
	/**
	 * 线程同步
	 * 设计四个线程对象对同一个数据进行操作，
	 * 两个线程执行减操作，两个线程执行加操作。
	 * 程序分析：
	 * 1.创建一个ThreadAddSub类继承Thread，重写run方法
	 * 2.在run方法里面实现加和减的操作，每次操作后睡眠1秒
	 * 3.创建主方法调用类
	 */
	public static void main(String[] args) {
		// 创建一个存放ThreadAddSub对象的数组
		ThreadAddSub[] tSub = new ThreadAddSub[4];
		for (int i = 0; i < tSub.length; i++) {
			// 把实例化ThreadAddSub对象赋值到数组内
			// 第一三个是true，二四个是false
			tSub[i] = new ThreadAddSub(i % 2 == 0 ? true : false);
			// 让线程开始工作
			tSub[i].start();
		}
	}
}
