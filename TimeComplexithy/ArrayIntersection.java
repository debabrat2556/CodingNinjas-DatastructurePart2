// Array Intersection
// Send Feedback
// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in ascending order.


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {


    //the below function is added here to take input for multiple arrays
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
        intersection(arr1, arr2); //where the intersection program really works
    }


    public static void intersection(int[] passArr1,int[] passArr2)
    {
        Arrays.sort(passArr1); //sorting both of the arrays so can do search properly
        Arrays.sort(passArr2);

        int m=Array.getLength(passArr1);  //taking the size of the input array

        // for(int i=0;i<m;i++)
        // {
        //     System.out.println("val received"+passArr1[i]);
        // }
        
        int n=Array.getLength(passArr2);
        int i=0;
        int j=0;
        while(i<m & j<n)
        {
            if (passArr1[i]==passArr2[j]) //if we find a match will be printing the value of ythat position
                                            // and will be moving the i and j th value to the next one
                {
                    System.out.println("intersection val "+passArr1[i]);
                    i++;
                    j++;    
                }
                else if (passArr1[i]<passArr2[j]) //this means we have received a value in the j th row 
                                                    //however we have not find the same in i th row 
                                                    //so to check the whole ith row we are increasin g the value of i
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