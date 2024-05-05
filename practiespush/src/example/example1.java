package example;

public class example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		int m=n/2;
		int flag=0;
		if(n==0|| n==1) {
			System.out.println("not a prime");
		}
		else {
			for(int i=2;i<=m;i++)
			{
                if(n%i==0) {
                	System.out.println("not a prime");
                flag=1;
                  break;
                } 	
			}
		
			if(flag==0)
			{
            	System.out.println("prime");

			}
		}
			
	}
}


