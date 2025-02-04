package Pattern;

public class Butterflypettern {
	
	public static void main(String[] args) {
		final int size =4;
		int i,j;
		
		for(i=0;i<size;i++)
		{
			//j=i;
			
			for(j=0;j<=8;j++)
			{
				int k = (size*2 - 1)-i ;
				if(j<=i || (j>=k &&j<size*2)) {
					System.out.print("*");
					
				}
//				else if(){
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		//back-word
		
		for(i=size-1;i>=0;i--)
		{
			//j=i;
			
			for(j=0;j<=8;j++)
			{
				int k = (size*2 - 1)-i ;
				if(j<=i || (j>=k &&j<size*2)) {
					System.out.print("*");
					
				}
//				else if(){
//					System.out.print("*");
//				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		
	}

}
