import java.util.*;
class Program4
{    
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	System.out.println(" size of the array:");
    int x=s.nextInt();
    int arr[]= new int[x];
    
    for(int i=0;i<x;i++)
    {
    	arr[i]=s.nextInt();
    }
     
    System.out.println("enter the element to be Searched:");  //19csu060
    int find=s.nextInt();
    
    int count=0;
    for(int i=0;i<x;i++)
    { 
       if(arr[i]==find)
       {

       	++count;

       }
    }
   if(count==0)
   {
    System.out.println("no such element");
   }

   else
    System.out.println("frequency of"+find+"is"+count);

}
}