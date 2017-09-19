package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NormalSerializationAndDeserialization{

	public static void main(String[] args) throws Exception{
		//Serialization starts here
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//Writing the Dog obj d1 to file dog.ser
		oos.writeObject(d1);
		//Serialization ends
		
		//Deserialization starts
		
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println("Value of i is : "+d2.i);
		System.out.println("Value of j is : "+d2.j);
	}

}