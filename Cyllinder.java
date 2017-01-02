package lesson2;

public class Cyllinder {
	int r=4;
	int h=6;
	double v;
	public void calculate(){
		v=3.14*(r*r*h);

		System.out.println("volume of cyllinder"+v);
	}
	public static void  main(String[] arg)
	{
		Cyllinder c=new Cyllinder();
		c.calculate();
	}
	

}
