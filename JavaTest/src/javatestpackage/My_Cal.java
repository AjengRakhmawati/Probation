package javatestpackage;

class communicationTools{
	protected String merk = "iPhone";
	public void call() {
		System.out.println("ring");
	}
}

class My_Cal extends communicationTools{
	private String part ="memeory card";
	public static void main (String[] args) {
		
	My_Cal myPhone = new My_Cal();
	
	myPhone.call();
	
	System.out.println(myPhone.merk+" "+myPhone.part);
	}
	
}