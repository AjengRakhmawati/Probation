package javaAdvanced;

// public class GenericClass<T> {
//	private T t;
//	
//	public void add(T t) {
//		this.t = t;
//	}
//	
//	public T get() {
//		return t;
//	}
//	public static void main(String[] args) {
//		GenericClass<Integer> integerClass = new GenericClass<Integer>();
//		GenericClass<String> stringClass = new GenericClass<String>();
//		
//		integerClass.add(new Integer(10));
//		stringClass.add(new String("Hello World"));
//		
//		System.out.printf("Integer Value :%d\n", integerClass.get());
//		System.out.printf("String Value :%s\n", stringClass.get());

//	}

//}

class GenericClass<T> {
	T obj;

	GenericClass(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;

	}



	public static void main(String[] args) {
		GenericClass<Integer> iObj = new GenericClass<Integer>(15);
		System.out.printf("%d\n\n", iObj.getObject());

		GenericClass<String> sObj = new GenericClass<String>("Hello Word");
		System.out.printf("%s", sObj.getObject());

	}
}
