package Serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerialization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 transient String pwd = "123456";
	 String name = "Rajeev Nayan";
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String epwd = (String)ois.readObject();
		pwd = (String)epwd.substring(3);
	}
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String epwd = "@#$"+pwd;
		oos.writeObject(epwd);
		
	}

}
