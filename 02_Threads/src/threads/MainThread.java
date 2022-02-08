package threads;

public class MainThread {

	public static void main(String[] args) {
		
		DateCommand dc = new DateCommand();
		CounterCommand cc = new CounterCommand();
		Sprecher sprecher = new Sprecher();
		dc.ausgeben();
		cc.ausgeben();
		
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dc.ausgeben();
			}
		});
		
		Thread t2 = new Thread(cc);
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				sprecher.sprechen();
				
			}
		});
		
		Thread t4 = new DateThread();
		
		
		
		System.out.println("--------------Threads:");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
