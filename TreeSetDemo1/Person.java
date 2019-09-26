package TreeSetDemo1;
import java.util.TreeSet;

import javax.management.RuntimeErrorException;
public class Person implements Comparable{

	public int age;
	public String name;
	public String stnum;
	
	
	public Person(int age,String name,String stnum) {
		
	this.age=age;
	this.name=name;
	this.stnum=stnum;
		
		
		
	}
	
	public void showinfo() {
		
		System.out.println("The pernal information of the student is ");
		System.out.println("Name:"+name+" Age: "+age+" Stundent number:"+stnum);
		
		
		
		
		
	}
	
	public int compareTo(Object obj) {
		
		if(!(obj instanceof Person))
			throw new RuntimeException("This object is not Person");
		Person ps=(Person)obj;
		
		if(this.age>ps.age)
			return 1;
		
		if(this.age==ps.age) 
		return this.name.compareTo(ps.name);//当主要条件满足时要看次要条件
				
		return -1;
	
	
	}
}
