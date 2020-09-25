package javaAdvanced;

import java.util.List;
import java.util.ArrayList;

public class Stack {
	 
//	   private String[] stack;
//	   private int max;
//	   private int top;
//
//public Stack(int size) {
//	     max = size;
//	     stack = new String[max];
//	     top = -1;
//}
//
//public void push(String value) {
//	      stack[++top] = value;
//}
//
//public String pop() {
//	      return stack[top --];
//}
//
//public String peek() {
//	      return stack[top];
//}
//
//public boolean isEmpty() {
//	      return top == -1;
//}
//
//public boolean isFull() {
//	      return top == max-1;
//}
//
//public static void main(String[] args) {
//	     Stack s = new Stack(5);
//
//	     // push data
//	     s.push("47");
//	     s.push("56");
//	     s.push("98"); 
//	     s.push("72");
//	     s.push("61");
//	     
//	     s.peek();
//	     //s.isEmpty(); 
//	     s.isFull();
//	     //s.pop();
//	   
//	     
//	     System.out.println(s.peek());
//	     //System.out.println(s.isEmpty());
//	     System.out.println(s.isFull());
//	     //System.out.println(s.pop());
//	  }
	private List<Object> list=new ArrayList<Object>();
	private int currentIndex = -1;
	
	public void push(Object object) {
		list.add(object);
		currentIndex++;
	}
	
	public Object pop() {
		Object object= list.remove(currentIndex);
		currentIndex--;
		return object;
	}
	public int count() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(currentIndex);
	}
	public void clear(){
		list.clear();
		currentIndex=-1;
	}
	
	public static void main(String[] args){
		Stack s = new Stack();
		s.push("buku1");
		s.push("buku2");
		s.push("buku3");
		s.push("buku4");
		
		int count = s.count();
		Object object = s.peek();
		System.out.println("Jumlah data pada stack : "+count);
		System.out.println("Data teratas pada stack : "+object);
		System.out.println("\n");
		
		object = s.pop();
		System.out.println("Data teratas yang dikeluarkan : "+object);
		count = s.count();
		System.out.println("Jumlah data sekarang : "+count);
		object = s.peek();
		System.out.println("Data teratas sekarang : "+object);
		
		
		
		
			
	}


}