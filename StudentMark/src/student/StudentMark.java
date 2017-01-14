package student;
import java. util.*;
public class StudentMark {
	String name;
float [] mark = new float[5];
float total=500;

 void accept()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the name of student");
	 name = s.next();
	 for(int i=0;i<=4;i++)
	 {
		System.out.print("Enter the mark of"+i+"it subject");
		mark[i] = s.nextFloat();
	 }
	 
		 }
 void calculate()
 {
	 float sum=0;
	 for(float num:mark)
	 
	 {
		 sum=sum+num;
		 
	 }
	 double percent=(sum / total)*100;
	 System.out.println("sum of the  mark="+sum);
	 System.out.println("percentage of the  mark="+percent);
	 if(percent>=85 && percent<=100)
	 {
		 System.out.println("grade=A+");
	 }
	 if(percent>=75 && percent<=84)
	 {
		 System.out.println("grade=A");
	 }
	 else if(percent>=64 && percent<=75)
	 {
		 System.out.println("grade=B");
	 }else if(percent>=50 && percent<=65)
	 {
		 System.out.println("grade=C");
	 }else
	 {
		 
			 System.out.println("fail");
		 }
	 }
 
 
	public static void main(String[] args) {
		
StudentMark sm = new StudentMark();
sm.accept();
sm.calculate();
	}

}
