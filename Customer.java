import java.util.*;
public class Customer{
String name;
int price;
int quantity;
int expence;
static salary = 1000;
void accept()
{
System.out.println("please enter the price and quantity as the expence is below 1000");
scanner sc = new Scanner(System.in);
name=sc.next();
price=sc.nextInt();
quantity=sc.nextInt();
void spend(){
expence = (quantity * price)
float spend% = (expence)*0.1;
System.out.println("total expences of the customer=" +" "+expence);
System.out.println("total spendings of the customer=" +" "+spend%);
}
public static void main(String [] args)
{
customer cust = new Customer();
cust.accept();
cust.spend();
}
}