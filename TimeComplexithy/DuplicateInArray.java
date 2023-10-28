// Duplicate in array
// Send Feedback
// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
// Note :
// Duplicate number is always present in the given array/list

import java.util.Scanner;

public class DuplicateInArray {

	public static void findDuplicate(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(arr[i]);
            }
        }
    }    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the size of the array");
    int sizeOfArray=sc.nextInt();
    int array1[]=new int[sizeOfArray];
    for(int i=0;i<sizeOfArray;i++)
    {
        array1[i]=sc.nextInt();
    }
    System.out.println();
    findDuplicate(array1);
}    
}
