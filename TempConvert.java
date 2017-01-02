package lesson3;
import java.util.Scanner;
public class TempConvert {
	
	float c=0;
	float f;
	public void calculate(){
		System.out.println("enter thr temperature in celsious ");
		Scanner s= new Scanner(System.in);
		c=s.nextFloat();
		f=(c*(9/5))+32;
		System.out.println("temperature in faranheat=:"+f);
		
	}
	public static void main(String[] arg){
		
		TempConvert t=new TempConvert();
		t.calculate();
		
	}

}
