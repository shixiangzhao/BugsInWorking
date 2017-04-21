package shixzh.biw.costomize.thread;

public class TicketWindowTest {

	public static void main(String[] args) {
		TicketWindow twt1 = new TicketWindow("窗口1");
		TicketWindow twt2 = new TicketWindow("窗口2");
		TicketWindow twt3 = new TicketWindow("窗口3");
		twt1.start();
		twt2.start();
		twt3.start();
	}
}
