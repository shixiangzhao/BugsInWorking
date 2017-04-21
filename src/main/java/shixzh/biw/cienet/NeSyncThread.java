package shixzh.biw.cienet;

public class NeSyncThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			NEEbo ne = new NEEbo("ne" + i);
			System.out.println(ne.getName() + " build at " + ne.getDate());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		NeSyncThread nst = new NeSyncThread();
		nst.start();
	}
}
