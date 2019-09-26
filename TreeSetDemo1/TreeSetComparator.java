package TreeSetDemo1;
import java.util.*;
public class TreeSetComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		Person p1=(Person)obj1;
		Person p2=(Person)obj2;
		
	int judesign= p1.name.compareTo(p2.name);
	
	if(judesign==0) {
		
		if(p1.age>p2.age)
			return 1;
		if(p1.age<p2.age)
			return -1;
		
		return 0;
		
		
	}
	
	return judesign;
	
	
	
	}

	
	
	
}
