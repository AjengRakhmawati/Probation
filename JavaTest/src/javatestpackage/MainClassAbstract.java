package javatestpackage;

abstract class kendaraan{
	public abstract void berjalan();
	public void bersuara() {
		System.out.println("brem brem!!");
	}
}

	class motor extends kendaraan{
	public void berjalan() {
		System.out.println("motor berjalan");
	}
}

	public class MainClassAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motor a = new motor();
		a.berjalan();
		a.bersuara();
		
	}

}
