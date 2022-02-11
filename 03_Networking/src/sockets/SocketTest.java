package sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	public static void main(String[] args) {
		try (Socket socket = new Socket("naughty.java.club", 80)){
			System.out.println(socket.getLocalAddress());
			Socket socket2 = new Socket(socket.getLocalAddress(), 12345);
			
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			
			
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println(socket.getPort());
			
			
			System.out.println("Verbindung hergestellt");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
