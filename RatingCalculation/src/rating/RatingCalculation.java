package rating;

public class RatingCalculation {
	int i;
	double sum =0;
	String [] name={"aparna","aditya","mohith","hari","subha","pradeep"};
	double [] rating= {4.5,4.8,3.0,4.1,5.0};
	
	void avgrating()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println(name[i]+" "+rating[i]);
			
			
		}
		
		for(double num :rating)
		{
			
					sum=sum +num;
		}
		double average=sum/5;
		System.out.println("average rating =:"+average);
	}
	public static void main(String[] args)

	{
		RatingCalculation c = new RatingCalculation();
		c.avgrating();
	   
	}}