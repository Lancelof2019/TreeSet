package TreeSetDemo1;
import java.util.TreeSet;
import java.util.Iterator;
public class MainTs {

	public static void main(String argsp[]) {
		
		TreeSetDemo1 tstest=new TreeSetDemo1();
		
		tstest.tsadd("Hello java","I am not a fish any more","Maybe I am still under a low level","But I believe I can do everything");
		System.out.println("#################################################");
		tstest.navi();
		System.out.println("#################################################");
	
		
		
		
		TreeSet<Person> tstest1=new TreeSet<Person>(new TreeSetComparator());
		
		tstest1.add(new Person(18,"Marry","012202"));
		
		tstest1.add(new Person(17,"John","012223"));
		tstest1.add(new Person(21,"Nancy","013498"));
		tstest1.add(new Person(12,"Tommy","016778"));
		tstest1.add(new Person(12,"Sonny","0944432"));
		tstest1.add(new Person(16,"Sonny","0944432"));
		
		Iterator<Person> ittsperson=tstest1.iterator();
		
		
		while(ittsperson.hasNext()) {
			
			ittsperson.next().showinfo();
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}
