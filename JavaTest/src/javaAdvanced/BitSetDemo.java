package javaAdvanced;

import java.util.*;
import java.util.HashMap;
public class BitSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BitSet bs1 = new BitSet();
		BitSet bs2 = new BitSet();
		
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(4);
		
		bs2.set(4);
		bs2.set(6);
		bs2.set(5);
		bs2.set(0);
		bs2.set(1);
		bs2.set(3);
		
		System.out.println("ini bs1 "+bs1);
		System.out.println("ini bs2 "+bs2);
		
		  //Map m1 = new HashMap();
//		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
//	      m1.put(8, "Zara");
//	      m1.put(10, "Mahnaz");
//	      m1.put(12, "Ayan");
//	      m1.put(14, "Daisy");                       
//	     
//	      System.out.println();
//	      System.out.println(" Map Elements");
//	      System.out.print("\t" + m1);
	}

}
