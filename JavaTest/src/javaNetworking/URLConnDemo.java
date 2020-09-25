package javaNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.tutorialspoint.com/java/java_networking.htm");
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection connection = null;
			if(urlConnection instanceof HttpURLConnection) {
				connection = (HttpURLConnection) urlConnection;
			}else {
				System.out.println("Please enter an HTTP URL. ");
				return;
			}
			
			System.out.println("cek1");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String urlString = "";
			String current;
			
			System.out.println("cek2");
			
			while((current = in.readLine()) !=null) {
				urlString += current;
			}
			System.out.println(urlString);
			System.out.println("cek3");
		}catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
