package Serialization;

import java.io.Serializable;

public class SerializationWithRespectToInheritance{
	//parent 0-arg constructor is called while deserializing the child class if parent is non serializable.
	public SerializationWithRespectToInheritance(){
		System.out.println("Parent class constructor called");
	}
	int i = 10;
}

class SerializationWithRespectToInheritanceInher1 extends SerializationWithRespectToInheritance  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SerializationWithRespectToInheritanceInher1(){
		System.out.println("Child Class constructor called");
	}
	int j = 20;
}