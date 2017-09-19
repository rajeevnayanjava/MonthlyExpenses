package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExternalizableDemo extDemo = new ExternalizableDemo(10, 20, "Rajeev");
		
		//serialization
		FileOutputStream fos = new FileOutputStream("ExternalizableDemo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(extDemo);
		oos.close();
		
		//Deserialization
		FileInputStream fis = new FileInputStream("ExternalizableDemo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo extDemo1 = (ExternalizableDemo)ois.readObject();
		ois.close();
		
		System.out.println("The value of i is : "+extDemo1.i);
		System.out.println("The value of j is : "+extDemo1.j);
		System.out.println("The value of name is : "+extDemo1.name);

	}

}
