package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientStaticFinalSerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		try{
			//Serialization starts
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		//serialization ends
		System.out.println("Dog object has been serialized.");
		}
		catch(FileNotFoundException fne){
			System.out.println(fne);
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		try{
		//Deserialization starts
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println("Dog object has been deserialized.");
		//Deserialization ends
		System.out.println("int i = "+d1.i+"\nint j = "+d1.j+"\nstatic int k = "+d1.k+"\nfinal int l= "+d1.l+"\nstatic final int m = "+d1.m+"\ntransient int n = "+d1.n+"\nfinal transient int o = "+d1.o+"\nstatic transient int p = "+d1.p+"\nfinal static transient int q = "+d1.q);
		
		}
		catch(FileNotFoundException fne){
			System.out.println(fne);
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		catch(ClassNotFoundException cnf){
			System.out.println(cnf);
		}
	}

}
