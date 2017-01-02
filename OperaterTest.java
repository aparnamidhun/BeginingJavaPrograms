package lesson4;

public class OperaterTest {
	int x=5;
	int y;
	int z;
	public void postIncreament(){
		y=x++;
		z=y++;
		y++;
		x++;System.out.println("---------POSTOPERATION--------");
		
		System.out.println("value of x="+x+" " +"value of y=" +y+ " "+"value of z=" +z);
	}
	public void preIncreament(){
		y=++x;
		z=++y;
		++y;
		++x;
		System.out.println("---------PREOPERATION--------");
		
		System.out.println("value of x="+x+" " +"value of y=" +y+ " "+"value of z=" +z);
	
		
	}
	public static void main(String[] arg){
		OperaterTest ot=new OperaterTest();
		ot.postIncreament();
		ot.preIncreament();
		
	}

}
