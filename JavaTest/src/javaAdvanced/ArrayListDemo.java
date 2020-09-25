package javaAdvanced;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> nilai1 = new ArrayList<Integer>();
		ArrayList<Integer> nilai2 = new ArrayList<Integer>();
		ArrayList<Integer> jumlah = new ArrayList<Integer>();

		System.out.println("Nilai 1");
		for (int i = 0; i < 3; i++) {
			nilai1.add(i);
			System.out.println("index ke " + i + " nilai 1 adalah " + nilai1.get(i));
		}

		System.out.println("\nNilai 2");
		for (int i = 0; i < 3; i++) {
			nilai2.add(i);
			System.out.println("index ke " + i + " nilai 2 adalah " + nilai2.get(i));
		}

		System.out.println("\nJumlah Nilai");

		for (int i = 0; i < 3; i++) {
			jumlah.add(nilai1.get(i) + nilai2.get(i));
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Jumlah nilai index ke "+ i+ " adalah "+ jumlah.get(i));
		}
	}

}
