// Array Equilibrium Index
// Send Feedback
// For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
// Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
// If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.
// Example:
// Let's consider an array/list Arr = [2, 3, 10, -10, 4, 2, 9]  of size, N = 7.

// There exist three equilibrium indices, one at 2, another at 3, and another at 5.

// At index 2, the sum of all the elements to the left, [2 + 3] is 5, and the elements to its right, [-10 + 4 + 2 + 9] is also 5. Hence index 2 is an equilibrium index according to the condition we want to achieve. Mind it that we haven't included the item at index 2, which is 10, to either of the parts.

// Similarly, we can see at index 3 and 5, the elements to its left sum up to 15 and 9 respectively and to the right, sum up to 15 and 9 respectively either. 

// Hence the answer would be 2.

import java.util.Scanner;

public class EquilibriumIndex {

    public static int[] takeinput(int m)
    {
        Scanner sc=new Scanner(System.in);
        int inputArray[]=new int[m];
        System.out.println("please enter data for the array");
        for(int i=0;i<m;i++)
        {
            inputArray[i]=sc.nextInt();
        }
        return inputArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr1[]=takeinput(size);
        EquilibriumFunction(arr1);
    }

    public static void EquilibriumFunction(int[] passedArray)  //function where equilibrium state is considered
    {
        int lengthOfArray=passedArray.length;
        int sum=0;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<lengthOfArray;i++)
        {
            System.out.println("value of array index "+i+" is"+passedArray[i]);
            sum=sum+passedArray[i];            //in this first loop we are just calculating the the 
                                                //total sum of all the elements present in the array
        } 
        for(int j=0;j<lengthOfArray;j++)        //this loop is similar to the loop above
        {
            rightSum=sum-leftSum;               //as we now have the total sum of the array w can calculate
                                                //the right sum at for the 0th position(for the 1st iteration)
                                                //consecutively for the other position as well
            
            leftSum=leftSum+passedArray[j];     //similarly left sum sum is also calculated

            if(leftSum==rightSum)               //we are comparing both the sides and then returning the value at
                                                //jth position
            {
                System.out.println("the value at which we achieved equilibrium is "+passedArray[j]+ "at position"+j);
            }
        }
    }
}
