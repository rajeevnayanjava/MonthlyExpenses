package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithRespectToInheritanceTest {

	public static void main(String[] args) throws Exception {
		// Serializaion
		SerializationWithRespectToInheritance swrti = new SerializationWithRespectToInheritanceInher1();
		FileOutputStream fos = new FileOutputStream("SerializationWithRespectToInheritanceTest.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(swrti);
		//Deserialization
		FileInputStream fis = new FileInputStream("SerializationWithRespectToInheritanceTest.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationWithRespectToInheritanceInher1 swrti1 = (SerializationWithRespectToInheritanceInher1)ois.readObject();
		System.out.println("value of i is : " + swrti1.i + "\nvalue of j is : "+swrti1.j);
		
		
		
		

	}

}
