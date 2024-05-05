package example;

public class example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=222,r,rev=0;
int temp=n;
while(n!=0)
{
	r=n%10;
	rev=(rev*10)+r;
	n=n/10;
	
}
if(temp==rev)
	System.out.println("palindrome number");
else
	System.out.println(" not a palindrome number");
	}


}
