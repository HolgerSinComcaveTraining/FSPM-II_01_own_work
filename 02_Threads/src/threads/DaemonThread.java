package threads;



public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable endless = () -> {
			while(true){
				System.out.println("Lauf Thread lauf");
			}
		};
		Thread thread = new Thread(endless);
		Thread dt = new DateThread();
		thread.setDaemon(true);
		dt.start();
		thread.start();
	}

}
