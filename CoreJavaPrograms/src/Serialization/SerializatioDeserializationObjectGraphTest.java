package Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializatioDeserializationObjectGraphTest {

	public static void main(String[] args) throws Exception {
		SerializatioDeserializationObjectGraph sdog = new SerializatioDeserializationObjectGraph();
		Cat c = new Cat();
		Rat r = new Rat();
		// Serialization
		FileOutputStream fos = new FileOutputStream("SerializatioDeserializationObjectGraph.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sdog);
		oos.writeObject(c);
		oos.writeObject(r);
		oos.close();
		// Deserialization
		FileInputStream fis = new FileInputStream("SerializatioDeserializationObjectGraph.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj;
		while (true) {
			try {
				obj = (Object) ois.readObject();
			} catch (EOFException eof) {
				break;
			}
			if (obj != null) {
				if (obj instanceof Cat) {
					Cat ser = (Cat) obj;
					System.out.println("Value of i for Cat instance " + ser.r.i);
				} else if (obj instanceof Rat) {
					Rat ser = (Rat) obj;
					System.out.println("Value of i for Rat instance " + ser.i);
				} else if (obj instanceof SerializatioDeserializationObjectGraph) {
					SerializatioDeserializationObjectGraph ser = (SerializatioDeserializationObjectGraph) obj;
					System.out.println("Value of i for SerializatioDeserializationObjectGraph instance " + ser.c.r.i);
				}
			}
		}
		ois.close();
	}

}
