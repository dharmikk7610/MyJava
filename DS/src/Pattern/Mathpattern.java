package Pattern;

public class Mathpattern {
	public static void main(String[] args) {
		final int n = 5;
		for(int i=0;i<n;i++)
		{
			int a=i+1;
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<9;j++)
			{
				
				if(j>=n-i && j<=n+i)
				{
					System.out.print(a);
					if(j>4)
					{
						a++;
					}
					else {
						a--;
					}
				}
			}
			System.out.println("");
		}
	}

}
