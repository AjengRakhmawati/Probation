package javaNetworking;

import java.io.IOException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.tutorialspoint.com/java/java_url_processing.htm");
			
			System.out.println("URL : "+url.toString());
			System.out.println("Protocol : "+url.getProtocol());
			System.out.println("Authority : "+url.getAuthority());
			System.out.println("File name : "+url.getFile());
			System.out.println("Host : "+url.getHost());
			System.out.println("Path : "+url.getPath());
			System.out.println("Port : "+url.getPort());
			System.out.println("Default port : "+url.getDefaultPort());
			System.out.println("Query : "+url.getQuery());
			System.out.println("Ref : "+url.getRef());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
