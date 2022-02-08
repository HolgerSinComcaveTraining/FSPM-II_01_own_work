package threads;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class DateThread extends Thread {
	
	public void ausgeben() {
		Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
	}

	@Override
	public void run() {
		this.ausgeben();
	}

	
}
