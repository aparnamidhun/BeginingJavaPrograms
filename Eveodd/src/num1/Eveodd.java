package num1;

import java.util.Scanner;
class Eveodd{
int n;
void check(){
Scanner s = new Scanner(System.in);
System.out.println("enter the number you want check");
n=s.nextInt();
if(n%2==0)
{
System.out.println( n+" "+ "is an even number ");
}
else

System.out.println(n+" " +"is an odd number ");
}

public static void main(String [] arg){
Eveodd eo = new Eveodd();
eo.check();

}
}