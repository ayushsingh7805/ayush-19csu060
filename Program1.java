import java.util.*;
class Program1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		int k=s.nextInt();
		int arr[]=new int[k];//here k is for size of array
		for(int i=0;i<k;i++)
			{
				arr[i]=s.nextInt();
			}
			

		int MAX_VALUE=arr[0];
		int MIN_VALUE=arr[0];



		for(int i=0;i<k;i++)
			{
				if(arr[i]>MAX_VALUE)
				MAX_VALUE=arr[i];
			else if(arr[i]<MIN_VALUE)
				MIN_VALUE=arr[i];
		  }
		  int x=MAX_VALUE- MIN_VALUE;

		System.out.print("The minimum and maximum value in the array is : "+MIN_VALUE+" and "+MAX_VALUE+" respectively." );
		System.out.print("difference is  "+x);
	}
}