package matrix1;
import java.util.*;
public class MatrixTranspose {
	int n=0;
	int m=0;
	void transpose(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of rows of the matrix");
		m=s.nextInt();
		System.out.println("enter the number of columns of the matrix");
		n=s.nextInt();
		System.out.println("Enter the Matrix");	
		int matrix1 [][] = new int[m][n];
		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
		matrix1[i][j]=s.nextInt();
				
		System.out.println("\nTransposed Matrix");
			
	for(int i=0;i<n;i++){
		System.out.println();
		for(int j=0;j<m;j++)
		{
		System.out.print(matrix1[j][i]+" ");
		}		
				}
		}
	public static void main(String[] args) {

	MatrixTranspose obj=new MatrixTranspose();
	obj.transpose();
	}
}
