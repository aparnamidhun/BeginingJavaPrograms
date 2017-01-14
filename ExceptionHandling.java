package exception;

public class ExceptionHandling {
	
	int n1;
	void arithmaticexpression()
	{
		int num;
	   int n2=0;
		try
		{
			
			num=n1/n2;
			System.out.println(num);
		}
		catch(ArithmeticException e1)
		{
		System.out.println(" divided by a number by zero is not possible");
	}
			}
	void arraybound()  throws ArrayIndexOutOfBoundsException{
		int array[]=new int[5];
		array[8]=67;
				throw new ArrayIndexOutOfBoundsException("check array index");
	}

void string()
{
	
	try
	{
		String n =null;
		int m=n.length();
		System.out.println("nullpointerexception");
		
	}
	finally
	{System.out.println("final bllock");
		
	}}
	

	public static void main(String[] args) {
		ExceptionHandling e = new ExceptionHandling();
		e.arithmaticexpression();
		e.arraybound();
		e.string();			}
		}
	


