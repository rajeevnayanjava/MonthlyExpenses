package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableDemo implements Externalizable{
	int i,j;
	String name;
	public ExternalizableDemo(){
		System.out.println("0-arg constructor");
	}
	
	public ExternalizableDemo(int i,int j,String name){
		this.i=i;
		this.j=j;
		this.name=name;
	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String)oi.readObject();
		i=oi.readInt();
		
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		// TODO Auto-generated method stub
		oo.writeObject(name);
		oo.writeInt(i);
		
	}

}
