package javaAdvanced;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class demo_enum {
	public static void main(String[] args) {
//
//		int a;
//		int i;
//		Scanner b = new Scanner(System.in);
//
//		
//		for (i=0;i<3;i++) {
//			System.out.println("tulis disini : ");
//			a=b.nextInt();
//			
//			if(a%2==0) {
//				System.out.println("hasil genap ");
//				
//			}else{
//				System.out.println("hasil ganjil ");
//			}
//			
//		}
//.............................................................................//		

//		int arr[] = new int[] {1,2,3,4};
//		Vector<Integer> v = new Vector();
//		Hashtable<Integer, String> h = new Hashtable();
//		
//		v.addElement(1);
//		v.addElement(2);
//		
//		h.put(1, "jawa");
//		h.put(2, "bali");
//		
//		System.out.println(arr[0]);
//		System.out.println(v.elementAt(0));
//		System.out.println(h.get(1));
//-----------------------------------------------------------------------------//
//		Vector<Integer> v = new Vector<Integer>();
//		
//		for(int i=1; i<=5; i++)
//			v.add(i);
//			
//			System.out.println(v);
//			
//			v.remove(3);
//			
//			System.out.println(v);
//			
//		for(int i=0; i<v.size(); i++)
//			System.out.print(v.get(i)+ " ");
//``````````````````````````````````````````````````````````````````````````````````//
//		 Map m1 = new HashMap(); 
//	      m1.put("nama", "ajeng");
//	      m1.put("jurusan", "sistem informasi");
//	      m1.put("kampus", "tel-u");
//	      
//	      System.out.println();
//	      System.out.println(" Map Elements");
//	      System.out.print("\t"+ m1.get("nama"));
//	      System.out.print(" "+ m1.get("jurusan"));
//	      System.out.print(" "+ m1.get("kampus"));
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
//		int count[] = { 34, 22, 10, 60, 30, 22 };
//		Set<Integer> set = new HashSet<Integer>();
//		try {
//			for (int i = 0; i < 5; i++) {
//				set.add(count[i]);
//			}
//			System.out.println(set);
//
//			TreeSet sortedSet = new TreeSet<Integer>(set);
//			System.out.println("The sorted list is:");
//			System.out.println(sortedSet);
//
//			System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
//			System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
//		} catch (Exception e) {
//		}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
		// Map Entry Interface
		
//		       Create a hash map
//		      HashMap hm = new HashMap();
//
//		      // Put elements to the map
//		      hm.put("Zara", new Double(3434.34));
//		      hm.put("Mahnaz", new Double(123.22));
//		      hm.put("Ayan", new Double(1378.00));
//		      hm.put("Daisy", new Double(99.22));
//		      hm.put("Qadir", new Double(-19.08));
//		      
//		      // Get a set of the entries
//		      Set set = hm.entrySet();
//		      
//		      // Get an iterator
//		      Iterator i = set.iterator();
//		     
//		      // Display elements 
//		      while(i.hasNext()) {
//		         Map.Entry me = (Map.Entry)i.next();
//		         System.out.print(me.getKey() + ": ");
//		         System.out.println(me.getValue());
//		      }
//		      System.out.println();
//		     
//		        Scanner a = new Scanner(System.in);
//		        System.out.println("Coba isi dulu : ");
//		        String b=a.nextLine();
//		        
//		      // Deposit 1000 into Zara's account
//		      double balance = ((Double)hm.get(b)).doubleValue();
//		      hm.put(b, new Double(balance + 1000));
//		      System.out.println(b+ " new balance: " + hm.get(b));

//..........................................................................//
	      // create a hash set
//	      LinkedHashSet hs = new LinkedHashSet();
//	      
//	      // add elements to the hash set
//	      hs.add("B");
//	      hs.add("A");
//	      hs.add("D");
//	      hs.add("E");
//	      hs.add("C");
//	      hs.add("F");
//	      
//	      System.out.println(hs);
		
//----------------------------------------------------------------------------//


		//Algoritma
		
//		LinkedList ll = new LinkedList();
//	      ll.add(new Integer(-8));
//	      ll.add(new Integer(20));
//	      ll.add(new Integer(-20));
//	      ll.add(new Integer(8));
//	      
//	      // Create a reverse order comparator
//	      Comparator r = Collections.reverseOrder();
//	      
//	      // Sort list by using the comparator
//	      Collections.sort(ll, r);
//	      
//	      // Get iterator
//	      Iterator li = ll.iterator();
//	      System.out.print("List sorted in reverse: ");
//	      
//	      while(li.hasNext()) {
//	         System.out.print(li.next() + " ");
//	      }
//	      System.out.println();
//	      Collections.shuffle(ll);
//	      
//	      // display randomized list
//	      li = ll.iterator();
//	      System.out.print("List shuffled: ");
//	      
//	      while(li.hasNext()) {
//	         System.out.print(li.next() + " ");
//	      }
//
//	      System.out.println();
//	      System.out.println("Minimum: " + Collections.min(ll));
//	      System.out.println("Maximum: " + Collections.max(ll));
		
		
////........................................................................//
		ArrayList al = new ArrayList();

	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");

	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      ListIterator litr = al.listIterator();
	      
	    
	      System.out.print("Modified contents of al: ");
	      itr = al.iterator();
	      
	      while(litr.hasNext()) {
		         Object element = litr.next();
		         litr.set(element + "+ ");
		      }
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      System.out.print("Modified list backwards: ");
	      
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.print(element + " ");
	      }
	      System.out.println();
		
//-----------------------------------------------------------------------//
	
		
	}
}