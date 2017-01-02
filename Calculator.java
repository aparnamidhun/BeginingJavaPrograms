package lesson1;
import java.util.Scanner;

public class Calculator {
	
	double[] numbers;
	int n;
	
void insert()
	{
	
		Scanner input = new Scanner(System.in);
		System.out.println("enter the lengnth of array");
		n = input.nextInt();
		numbers = new double[n];
		for(int i=0;i<numbers.length;i++){
			System.out.println("enter the number");
			numbers[i] = input.nextDouble();
			
			
		}
		
		}
		
	
	void sum()
	{
        double avg=0;
		double sum=0;
		double max=0;
	for(int num=0;num<numbers.length;num++)
		{
			sum=sum+numbers[num];
			avg=sum/numbers.length;
			
			
		}
	System.out.println("summation =" +sum +"average=: "+ avg );
	
	for(int i=0;i<numbers.length-1;i++){
		if ( numbers[i] > numbers[i+1])
			max=numbers[i];
		else
			max=numbers[i+1];
		
	}
		System.out.println(" the maximumvalu" +max);
		
	}
	void sub()
	{
		double sub=0;
	for(double num:numbers)
	{	
		sub = sub - num ;
	
		
	}
		System.out.println("subtraction result:"+sub);
	}
	void mul(){
		double mul=1;
		for(int num=0;num<numbers.length;num++)
			{
				mul=mul* numbers[num];
			
			}
		System.out.println(" multiplication result = " +mul);
		
	}
	
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.insert();
		cl.sum();
		cl.sub();
		cl.mul();
	}

}
