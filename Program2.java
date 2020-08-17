import java.util.*;

class Program2{                

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int size=sc.nextInt();
    int arr[]= new int[size];
    System.out.println("Start entering:");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    
     System.out.println("for even index");
    for(int i=1;i<size;i=i+2)
    {
        System.out.println(arr[i]+" ");
    }

    System.out.println("for odd index");
    for(int i=0;i<size;i=i+2)
    {
        System.out.println(arr[i]+" ");
    }

 
    System.out.println("First element:"+arr[0]);
    System.out.println("last element:"+arr[size-1]);
    
    for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
    }
}