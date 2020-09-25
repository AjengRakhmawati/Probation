package javaAdvanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable {
	private int stuNum;
	private int stuAge;
	private String stuName;
	private transient String stuAddress;
	private transient int stuHeight;

	public Student(int num, int age, String name, String address, int height) {
		this.stuNum = num;
		this.stuAge = age;
		this.stuName = name;
		this.stuAddress = address;
		this.stuHeight = height;
	}

	public int getstuNum() {
		return stuNum;
	}

	public void setstuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getstuAge() {
		return stuAge;
	}

	public void setstuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getstuName() {
		return stuName;
	}

	public void setstuName(String stuName) {
		this.stuName = stuName;
	}

	public String getstuAddress() {
		return stuAddress;
	}

	public void setstuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getstuHeight() {
		return stuHeight;
	}

	public void setstuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}

	public static void main(String[] args) {
		
		//Serialization
		
		Student obj = new Student(144, 22, "Ajeng", "Jogja", 150);
		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("serialization done!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		
		//Deserialization

		    Student o=null;
		    try{
		      FileInputStream fis = new FileInputStream("Student.ser");
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      o = (Student)ois.readObject();
		      ois.close();
		      fis.close();
		    }
		    catch(IOException ioe)
		    {
		       ioe.printStackTrace();
		       return;
		    }catch(ClassNotFoundException cnfe)
		     {
		       System.out.println("Student Class is not found.");
		       cnfe.printStackTrace();
		       return;
		     }
		    System.out.println("Student Name:"+o.getstuName());
		    System.out.println("Student Age:"+o.getstuAge());
		    System.out.println("Student Roll No:"+o.getstuNum());
		    System.out.println("Student Address:"+o.getstuAddress());
		    System.out.println("Student Height:"+o.getstuHeight());

	}

}
