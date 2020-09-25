package interfacesTest;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    	Phone GalaxyNote8 = new Samsung();
    	
    	PhoneUser ajeng = new PhoneUser(GalaxyNote8);
    	ajeng.turnOnThePhone();
    	
    	Scanner input = new Scanner(System.in);
    	String aksi;
    	
    	while (true) {
    	System.out.println("Interface Aplikasi");
    	System.out.println("[1] Nyalakan Hp");
    	System.out.println("[2] Matikan Hp");
    	System.out.println("[3] Perbesar Volume");
    	System.out.println("[4] Kecilkan Volume");
    	System.out.println("[0] keluar");
    	System.out.println(".......................");
    	System.out.print("Pilih aksi>>");
    	aksi = input.nextLine();
    	
    	if(aksi.equalsIgnoreCase("1")) {
    		ajeng.turnOnThePhone();
    	}else if(aksi.equalsIgnoreCase("2")) {
    		ajeng.turnOffThePhone();
    	}else if(aksi.equalsIgnoreCase("3")) {
    		ajeng.makePhoneLouder();
    	}else if(aksi.equalsIgnoreCase("4")) {
    		ajeng.makePhoneSilent();
    	}else if(aksi.equalsIgnoreCase("0")) {
			System.exit(0);
		}else {
			System.out.println("no one");
		}
    	
    	
        
            }

}
}
