package javaAdvanced;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(1, 1);
		System.out.println("Initial size : " + v.size());
		System.out.println("Initial capacity : " + v.capacity());

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("capacity after four additions : " + v.capacity());

		v.addElement(new Double(5.45));
		System.out.println("Current capacity: " + v.capacity());

		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: " + v.capacity());

		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Current capacity: " + v.capacity());
		
		v.addElement(new Double(8.04));
		
		System.out.println("Current capacity: " + v.capacity());

		v.addElement(new Integer(44));
		v.addElement(new Integer(35));
		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Integer) v.lastElement());
		
		if (v.contains(new Integer(3)))
			System.out.println("Vector contains 3.");

		// enumerate the elements in the vector.
		Enumeration vEnum = v.elements();
		System.out.println("\nElements in vector:");

		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		//System.out.println();
	}

}
