package javaAdvanced;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Daisy", new Double(32.3));
		balance.put("Winna", new Double(54.1));
		balance.put("Rachel", new Double(78.2));
		balance.put("Ajeng", new Double(17.7));
		
		names = balance.keys();
		
		while(names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
			
	      }        
	      System.out.println();
	      
	      bal = ((Double)balance.get("Ajeng")).doubleValue();
	      balance.put("Ajeng", new Double(bal + 1000));
	      System.out.println("Ajeng's new balance: " + balance.get("Ajeng"));
	      
	      
		}

	}

