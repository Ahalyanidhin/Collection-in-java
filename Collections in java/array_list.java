package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList();
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        
        
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        
        
        Iterator i=list.iterator();
        
        System.out.printf("[");
        
        while(i.hasNext()) {
        	System.out.printf("%d ",i.next());
        	}
        System.out.printf("]");
        }
        
        
	}


