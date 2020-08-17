import java.util.*;
 
class Program5
{   
    
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        
	System.out.println("Enter size of array in rows and coloum:");
    int rows=sc.nextInt();
    int coloum=sc.nextInt();
    int arr[][]= new int[rows][coloum];
    System.out.println("Enter Elements in the array:");
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;j<coloum;j++)
        {
            arr[i][j]=sc.nextInt();
             int count = 0;
            int num=arr[i][j];
           
        do
        {  
            while(num!= 0)
        { 
            num /= 10;
            ++count;
        }
            if(count>2)
            {
            System.out.println("The number cannot be greater than two digit");
            System.out.println("Enter again:");
            arr[i][j]=sc.nextInt();
            int num2=arr[i][j];
            int count2=0;
            while(num2!= 0)
           { 
            num2 /= 10;
            ++count2;
           }
        if(count2>2)
            {
            System.out.println("The number cannot be greater than two digit");
            System.out.println("Enter again:");
            arr[i][j]=sc.nextInt();
            }
            else if(count2<=2)
            {
                break;
            }
        }
            else
            {
                break;
            }
        }while(count>2);
        }
    }

   
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<coloum;j++)
        {
           System.out.print(arr[i][j]+" ");
        }
        System.out.println(); 
    }
     

    System.out.println("After multipyling array by 2:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<coloum;j++)
        {
           int mul=arr[i][j];
           mul=mul*2;
           System.out.print(mul+" "); 
        }
        System.out.println(); 
    }
}
}