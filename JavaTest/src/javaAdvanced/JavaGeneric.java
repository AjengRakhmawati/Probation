package javaAdvanced;

public class JavaGeneric {

	public static < E > void printArray (E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.print("IntegerArray : ");
		printArray(intArray);
		
		System.out.print("DoubleArray : ");
		printArray(doubleArray);
		
		System.out.print("CharacterArray : ");
		printArray(charArray);
	}

}
