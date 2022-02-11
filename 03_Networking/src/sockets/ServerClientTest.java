package sockets;

import sockets.client.MulClient;
import sockets.server.MulServer;

public class ServerClientTest {

	public static void main(String[] args) {
//		MulServer mul = new MulServer(30425);
//		Thread server = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				mul.starte();
//			}
//		});
//		server.start();
		MulClient mc = new MulClient(3430, "8", "10");
		mc = new MulClient(3430, "123", "100");
	}

}
