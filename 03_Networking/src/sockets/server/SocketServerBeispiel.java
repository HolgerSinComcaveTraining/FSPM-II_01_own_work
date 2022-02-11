package sockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerBeispiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ServerSocket server = new ServerSocket(12345)){
			System.out.println("gestartet");
			System.out.println(server.getLocalSocketAddress());
			Socket client = server.accept();
			System.out.println("client accepted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
