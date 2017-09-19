package Serialization;

import java.io.Serializable;

public class Dog implements Serializable{

	int i=10;
	int j=20;
	static int k=30;
	final int l=40;
	static final int m=50;
	transient int n = 60;//for transient variable default value will be saved on file (ie 0) 
	final transient int o = 70;
	static transient int p = 80;
	final static transient int q = 90;
	
}
