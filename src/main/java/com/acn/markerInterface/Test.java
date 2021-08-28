package com.acn.markerInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		
		
		//Cloneable Interface Demo
		CloneableDemo cd= new CloneableDemo("Ramesh",27);		
		CloneableDemo cd1=(CloneableDemo)cd.clone();
		System.out.println("Hey ur Name is : "+cd1.getName()+ "and ur age is: "+cd.getAge());
		
		
		//Serializiable interface Demo
		SerialziableDemo sd= new SerialziableDemo("Ramesh",27);
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ramesh.yadav\\Desktop\\EWS\\Det.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(sd);
		
		
		 // De-serializing 'a' 
        FileInputStream fis = new FileInputStream("C:\\Users\\ramesh.yadav\\Desktop\\EWS\\Det.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        SerialziableDemo sd1 = (SerialziableDemo)ois.readObject();//down-casting object 
  
        System.out.println(sd1.name+" "+sd1.age); 
		oos.close(); 
        ois.close();

	}

}
