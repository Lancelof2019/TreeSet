package TreeSetDemo1;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo1 {

	public static TreeSet<String> tstest=new TreeSet<String>();
	//public static Iterator<String> itts=tstest.iterator();这里是空的话下面的调用调的是空值。
	
	public void  tsadd(String...s){
		for(int a=0;a<s.length;a++) {
			
			System.out.println("The length is "+s.length);
			tstest.add(s[a]);
			System.out.println("The element of treeset is "+s[a]);
			
			
		}
		
		
		
			
		
		
	}
		
		public void navi() {
		    Iterator<String> itts=tstest.iterator();
		
			while(itts.hasNext()) {
				
				
			
				System.out.println(itts.next());
		}
		
		
		
	}
	

	
}
