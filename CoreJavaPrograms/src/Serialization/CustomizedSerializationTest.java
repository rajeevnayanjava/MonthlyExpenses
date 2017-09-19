package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class CustomizedSerializationTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Serialization of CustomizedSerialization class obj Starts
		CustomizedSerialization cs = new CustomizedSerialization();
		FileOutputStream fos = new FileOutputStream("CustomizedSerialization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cs);
		
		//Deserialization of CustomizedSerialization Class obj Starts
		FileInputStream fis = new FileInputStream("CustomizedSerialization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomizedSerialization cst = (CustomizedSerialization)ois.readObject();
		
		System.out.println("Name is : "+cst.name + "       Password is : "+ cst.pwd);
	}

}
