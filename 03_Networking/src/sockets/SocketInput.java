package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketInput {

	public static void main(String[] args) throws UnknownHostException, IOException {
		final String TIME_SERVER = "time-c.nist.gov";
		final int TIME_SERVER_PORT = 13;
		
		final String TIME_WINDOWS = "time.wondows.com";
		final int TIME_WINDOWS_PORT = 123;
		

		try (Socket socket = new  Socket(TIME_SERVER, TIME_SERVER_PORT);
			InputStream is = socket.getInputStream();
			Scanner input = new Scanner(is, "ASCII") ){
				input.nextLine();
				String line = input.nextLine();
				System.out.println(line);
		}
		
//		try (Socket socket = new  Socket(TIME_WINDOWS, TIME_WINDOWS_PORT);
//				InputStream is = socket.getInputStream();
//				Scanner input = new Scanner(is, "ASCII") ){
//					
//					while (input.hasNext()) {
//						String line = input.nextLine();
//						System.out.println(line);
//					}
//					
//			}
		
	}

}
