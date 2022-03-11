package Collections.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CRUD_operation_using_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("CURD OPERATIONS");
		System.out.println("---------------");
		String Display,Install,Uninstall,Update,Quit;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String>list=new ArrayList<String>();
	do {	
		System.out.println("1.Display");
		System.out.println("2.Install");
		System.out.println("3.Uninstall");
		System.out.println("4.Update");
		System.out.println("5.Quit");
		System.out.println("             ");
		System.out.println("Enter Your Choice:");
		choice=sc.nextInt();
		
		System.out.println("             ");
		switch(choice) {
		case 1:
		if(list.isEmpty()) {
			System.out.println("Applications not found");
		}
		else 
		{
			Iterator i=list.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}break;
		case 2:
		int	f=0;
			System.out.println("Application Name");
			System.out.println("----------------");
			String s1=sc.next();
			
			Iterator i1=list.iterator();
			while(i1.hasNext()) {
				String app=(String) i1.next();
				if(s1.equals(app)) {
					f=1;break;
				}
			}if(f==1) {
				System.out.println("             ");
				System.out.println("Application already exists");
			}else {
				list.add(s1);
				System.out.println("             ");
				System.out.println("Application installed Successfully.....");
			}
				break;
	case 3:
			if(list.isEmpty()) {
				System.out.println("             ");
				System.out.println("No apps found");
			}
			else {
				int in=0;
				Iterator i=list.iterator();
				while(i.hasNext()) {
					System.out.println(in+" "+ i.next());
                    in++;
				}
				System.out.println("             ");
				System.out.println("Enter the index value");
				int index=sc.nextInt();
	list.remove(index);
	System.out.println("             ");
	System.out.println("Application Uninstalled......");
	System.out.println("             ");
			}break;
	case 4:
		int in=0;
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(in+" "+ i.next());
            in++;
		}
		System.out.println("             ");
		System.out.println("Enter the index value");
		int index=sc.nextInt();
		System.out.println("             ");
		System.out.println("Enter the value");
		String s2=sc.next();
list.set(index, s2);
System.out.println("             ");
System.out.println("Updated successfully.....");
		break;
		
	case 5:
		System.out.println("             ");
		System.out.println("Exited.....");
			System.exit(0);
			
		break;
		
	default:
		System.out.println("Invalid user input");
		}
		}while(choice!=0);
 
	
	}
	}
