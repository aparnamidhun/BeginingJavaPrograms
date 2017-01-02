package lesson5;
import java.util.Scanner;

public class Employee {
	String id;
	String name;
	static Scanner s;
	public void enter(){
		Scanner s= new Scanner (System.in);
		System.out.println("enter the student id");
		id=s.next();
		System.out.println("enter the student name");
		name=s.next();}
	public void display(){
		
		
		System.out.println("enter the student id="+id+ "student name="+name);
	
		
	}

	public static void main(String[] args) {
		Employee e =new Employee();
		int choice;
		Scanner s= new Scanner (System.in);
		System.out.println("1.enter the data");
		System.out.println("2.display the data");
		System.out.println("3.exit");
		choice=s.nextInt();
		switch (choice){
		case 1:
			System.out.println("1.enter the data");
		e.enter();
		break;
	case 2:System.out.println("1.disssplay data");
		e.display();
		break;
		case 3:
			System.exit(0);
			default:
				System.out.println("invalid choice");
				break;
		}
			
		
		
		
		
	}

}
