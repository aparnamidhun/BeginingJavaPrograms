package lesson1;
import java.util.Scanner;
public class Distance {
	float u;
	float a;
	float t;
	double d;
	
public void insert()
{
	Scanner s= new Scanner(System.in);
	System.out.println(" enter the initial velocity");
	 u = s.nextFloat();
	System.out.println("enter the time taken to traval");
	t=s.nextFloat();
	System.out.println("enter the acceleration taken to traval");
	a=s.nextFloat();
	
}
public void display(){
	d=(u*t)+(0.5*a*t*t);
	System.out.println(" the distence  to traval"+d);
	
	
}
public static void main(String[] arg){
	Distance dc=new Distance();
	dc.insert();
	dc.display();
}

}
