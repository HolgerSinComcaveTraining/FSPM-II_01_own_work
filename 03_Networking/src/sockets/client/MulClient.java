package sockets.client;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MulClient {

	private int port;
	
	public MulClient(int port, String factor1, String factor2) {
		this.port = port;
		this.multiply(factor1, factor2);
	}
	
	
	private void multiply(String factor1, String factor2) {
		//try (Socket socket = new Socket("192.168.0.108", this.port);
		try (Socket socket = new Socket("87.150.119.233", this.port);
			Scanner in = new Scanner(socket.getInputStream(),"UTF-8");
			Writer osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
			PrintWriter out = new PrintWriter(osw, true)){
			
			
			out.println(factor1);
			out.println(factor2);
			System.out.println("Ergebnis: " + in.nextLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
