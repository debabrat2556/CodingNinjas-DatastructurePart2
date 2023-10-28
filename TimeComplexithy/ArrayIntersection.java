import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {

public static int[] takeinput(int m)
{
    Scanner sc=new Scanner(System.in);
    int inputArray[]=new int[m];
    for(int i=0;i<m;i++)
    {
        inputArray[i]=sc.nextInt();
    }
    return inputArray;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size for the array");
        int m=sc.nextInt();
        System.out.println("please enter size for the array 2");
        int n=sc.nextInt();
        System.out.println("please enter values for the first array");
        int arr1[]=takeinput(m);
        System.out.println("please enter values for the second array");
        int arr2[]=takeinput(n);
        intersection(arr1, arr2);
    }


    public static void intersection(int[] passArr1,int[] passArr2)
    {
        Arrays.sort(passArr1);
        Arrays.sort(passArr2);
        
        int m=Array.getLength(passArr1);

        // for(int i=0;i<m;i++)
        // {
        //     System.out.println("val received"+passArr1[i]);
        // }
        
        int n=Array.getLength(passArr2);
        int i=0;
        int j=0;
        while(i<m & j<n)
        {
            if (passArr1[i]==passArr2[j]) 
                {
                    System.out.println("intersection val "+passArr1[i]);
                    i++;
                    j++;    
                }
                else if (passArr1[i]<passArr2[j]) 
                {
                    i++;    
                }
                else
                {
                    j++;
                }
        }
    }
}

    

