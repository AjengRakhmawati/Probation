package javatestpackage;

class Hewan{
	public void move() {
		System.out.println("Hewan bisa berpindah");
	}
}
class Anjing extends Hewan{
	public void move() {
		super.move();
		System.out.println("Anjing can guguk!!");
	}
}
public class TestDogOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hewan a = new Anjing();
		a.move();
	}

}
