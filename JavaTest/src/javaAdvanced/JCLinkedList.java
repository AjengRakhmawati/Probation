package javaAdvanced;

import java.util.*;

public class JCLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> list = new LinkedList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.addFirst("zero");
		list.addLast("four");
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
