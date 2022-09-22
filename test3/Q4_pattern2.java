package test3;

public class Q4_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j%2);
			}
			System.out.println();
		}


	}

}
