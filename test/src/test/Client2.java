package test;

import java.net.Socket;
import java.io.*;
import java.nio.CharBuffer;

public class Client2 {
	public static void main(String args[]) {
		
		
		try {
			Socket socket = new Socket("192.168.75.32", 7171);

			while(true){
				PrintWriter os = new PrintWriter(socket.getOutputStream());
				os.write("hello!!!!!!!!!!!");
				//System.out.println("back info:"+s);
				os.flush();
				BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				CharBuffer readBuffer=CharBuffer.allocate(1024);
				is.read(readBuffer);
				readBuffer.flip();
	            System.out.println("back info: " + readBuffer.toString());
	            
	            Thread.sleep(1000*5);
			}
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

