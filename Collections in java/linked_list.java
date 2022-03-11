package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> al=new LinkedHashSet<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravis");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
