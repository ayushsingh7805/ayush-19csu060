import java.util.*;
class Program3
{       	

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);     //19csu060
	  
    int x=s.nextInt();

    int arr[]= new int[x];

    int sum=0;
    for(int i=0;i<x;i++)
    {
    	arr[i]=s.nextInt();
    }
        
    for(int i=0;i<x;i++)
    {
       sum=sum+arr[i];
    }
    System.out.println("sum :"+sum);
    int sum2=0;
    for(int i=0;i<x;i=i+2)
    {
       sum2=sum2+arr[i];
    }
    System.out.println("alternate sum:"+sum2);   
     
    }
}