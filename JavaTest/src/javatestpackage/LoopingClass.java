package javatestpackage;

public class LoopingClass {
	public static void main (String[] args) {
	int age = 22;
	
	if (age > 22) {
		System.out.println("Old");
	}else {
		System.out.println("young");
	}

	int exercise = 3;
	switch (exercise) {
	case 1:
		System.out.println("exercise tools");
		break;
	case 2:
		System.out.println("exercise java basic");
		break;
	case 3:
		System.out.println("exercise maven");
		break;
	default:
		System.out.println("no one");;
	}
	
	
	do {
		System.out.println(age);
		age++;	
	}
	while (age < 25);
}
}