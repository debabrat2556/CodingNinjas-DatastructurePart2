// Triplet sum
// Send Feedback
// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
// Note :
// Given array/list can contain duplicate elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an integer 'X'.
// Output format :
// For each test case, print the total number of triplets present in the array/list.

// Output for every test case will be printed in a separate line.

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n=sc.nextInt();
        System.out.println("please enter the desired number");
        int num=sc.nextInt();
        int arr1[]=new int[n];

        //taking input
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        // pairSum(arr1,num);
        System.out.println(tripletSum(arr1,num));
    }  
    
    
    public static int tripletSum(int[] arr, int num)
    {
        int n=arr.length;   //taking length of the array
        Arrays.sort(arr);   //sorting the array
        int count=0;
        int k=0;
        for(int i=0;i<n-2;i++)                              //array starts from the 0th position
        {
            System.out.println("value of i is "+arr[i]);
            for(int j=i+1;j<n-1;j++)                        //array starts from 1st position if i val is 0
            {
                System.out.print(" | value of j is "+arr[j]);
                for(k=j+1;k<n;)                                 //array starts from 2nd position if j val is 1
                                                                //as j val increases k value also increases 
                {
                    System.out.print(" | value of k is "+arr[k]);
                    if (arr[i]+arr[j]+arr[k]==num) 
                    {
                        count++;    
                    }
                    k++;
                }
                
                System.out.println();
            }
        }
        return count;
    }

    
}
