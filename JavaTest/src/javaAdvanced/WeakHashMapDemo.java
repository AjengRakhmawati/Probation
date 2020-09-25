package javaAdvanced;

import java.util.*;

public class WeakHashMapDemo {

	private static Map map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new WeakHashMap();
//		map.put(new String("Maine"), "Augusta");

		Scanner input = new Scanner(System.in);

		Runnable runner = new Runnable() {

			public void run() {

				System.out.print("cek");

				System.out.print("Input : ");
				int a = input.nextInt();

				while (a < 3) {
					try {
						System.out.print("cek2 ");
						Thread.sleep(500);
					} catch (InterruptedException ignored) {
						// TODO: handle exception
					}
					System.out.println("Thread waiting");
					System.gc();

					a++;
				}
				System.out.print("cek3 ");

			}
		};
		Thread t = new Thread(runner);
		t.start();
		System.out.println("Main waiting");
		try {
			t.join();
			
			System.out.print("has joined");

		} catch (Exception e) {
			System.out.print("Out Of Capacity");

		}
		
		
	}

}
