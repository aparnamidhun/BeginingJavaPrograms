package lesson6;
import java.util.Scanner;
public class Multiplication5 {
	int a=1;
	void Multiplication(int a)
	{
		this.a=a;
	}
		public void getvalue(){
			
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value of a")	;
		a=s.nextInt();
		
	}
	
	public void multiplication()
	{
		System.out.println("*******multiplication table****")	;
		int i;
		for(i=1;i<=10;i++){
			
			
		System.out.println(a*i)	;
		}
	}
	public static void main(String[] arg)
		{
			Multiplication5 mul = new Multiplication5();
			mul.getvalue();
			mul.multiplication();
			
			
			
		}
		
		
	}
	


