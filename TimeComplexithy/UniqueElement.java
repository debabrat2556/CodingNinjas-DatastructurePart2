// Find the Unique Element
// Send Feedback
// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
//  Note:
// Unique element is always present in the array/list according to the given condition.

import java.util.Scanner;

public class UniqueElement {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the size of the array");
    int sizeOfArray=sc.nextInt();
    int array1[]=new int[sizeOfArray];
    for(int i=0;i<sizeOfArray;i++)
    {
        array1[i]=sc.nextInt();
    }
    for(int i=0;i<sizeOfArray;i++)
    {
        int count=0;
        for(int j=0;j<sizeOfArray;j++)
        {
            if(array1[i]==array1[j])
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.print(array1[i]+" ");
        }
    }
}    
}
