package javatestpackage;

public class ArrayClass {
	
	public static void main(String[] args) {
	int[] numList = {1, 2, 3, 4, 5};

	for (int i = 0; i < numList.length; i++){
		System.out.println(numList[i] + " ");
		
	}
	int total = 0;
	for (int i = 0; i < numList.length; i++) {	 
		 total += numList[i];
	}
	System.out.print("Total " + total);
	
}
	
}
