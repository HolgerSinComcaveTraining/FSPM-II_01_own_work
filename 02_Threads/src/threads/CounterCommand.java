package threads;

import java.util.stream.IntStream;

public class CounterCommand implements Runnable {

	public void ausgeben() {
		IntStream.range(0,20).forEach(System.out::println);
		
	}

	@Override
	public void run() {
		this.ausgeben();
		
	}
}
