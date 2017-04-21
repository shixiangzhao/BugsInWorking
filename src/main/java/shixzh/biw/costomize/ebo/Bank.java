package shixzh.biw.costomize.ebo;

public class Bank {

	// 假设一个账户有1000块钱
	private static int money = 1000;

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Bank.money = money;
	}

	// 柜台Counter取钱的方法
	public void Counter(int money) {// 参数是每次取走的钱
		// Bank.money -= money;// 取钱后总数减少
		subMoney("A", money);
	}

	// ATM取钱的方法
	public void ATM(int money) {// 参数是每次取走的钱
		// Bank.money -= money;// 取钱后总数减少
		subMoney("B", money);
	}

	private synchronized void subMoney(String name, int money) {
		Bank.money -= money;
		System.out.println(name + "取走了" + money + "还剩下" + (Bank.money));
	}
}
