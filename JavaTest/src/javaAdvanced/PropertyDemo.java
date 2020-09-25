package javaAdvanced;

import java.util.*;

public class PropertyDemo {

	public static void main(String args[]) {
	   Properties ibukota = new Properties(); 
       Set provinsi; 
       String str; 
         
       ibukota.put("Jawa Timur", "Surabaya"); 
       ibukota.put("Jawa Tengah", "Semarang"); 
       ibukota.put("Jawa Barat", "Bandung"); 
         
       // checking what's in table 
       provinsi = ibukota.keySet(); 
       Iterator itr = provinsi.iterator(); 
         
       while(itr.hasNext()) 
       { 
           str = (String)itr.next(); 
           System.out.println("Ibu kota " + str +  
                   " adalah " + ibukota.getProperty(str)); 
       } 
         
       System.out.println(); 
         
       // looking for URL that not in list 
       str = ibukota.getProperty("Bali", "not found"); 
       System.out.println("Ibu kota Bali " + str +"."); 


	}
}