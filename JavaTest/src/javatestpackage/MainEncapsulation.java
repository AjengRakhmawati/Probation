package javatestpackage;

//class person{
//	private String name;
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String newName) {
//		this.name = newName;
//	}
//}
//
//public class MainEncapsulation {
//
//	//static String newName = "Ajeng"; 
//	public static void main(String[] args) {
//		person asObject = new person();
//		asObject.setName("ajeng");
//		System.out.println(asObject.getName());
//		
//
//	}
//
//}

class DataDiri{
	private String Nama;
	private String ID;
	private int Num;


public String getNama() {
	return Nama;
}

public String getID() {
	return ID;
}

public int getNum() {
	return Num;
}

public void setNama(String newNama) {
	Nama = newNama;
}

public void setID(String newID) {
	ID = newID;
}

public void setNum(int newNum) {
	Num = newNum;
}

}

public class MainEncapsulation {
 	
	public static void main(String[] args) {
		DataDiri a = new DataDiri();
		a.setNama("Ajeng Rakhmawati");
		a.setID("3517125902980001");
		a.setNum(22);
		System.out.print("Nama : "+ a.getNama()+ "\nNo. KTP : "+ a.getID() +"\nNumber : " + a.getNum());
	
	}
}