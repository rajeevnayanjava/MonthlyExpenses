package Serialization;

import java.io.Serializable;

public class SerializatioDeserializationObjectGraph implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat implements Serializable 
{
	int i = 10;
}
