package CodingNinjas_DatastructurePart2.Recursion;

import java.util.Scanner;

public class SumoOfArray {
    public static void main(String[] args) {
        int array1[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<array1.length;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println(sum(array1));
    }
    // writing the function
    public static int sum(int input[]) 
    {
        if(input.length==0)
        {
            return 0;
        }
        //in the above statement if the array length is 0 the program is supposed to return 0 value

        int smallArray[]=new int[input.length-1];
        //here we are creating a smaller array 
        //so if the original size is 5, for this array it would be for

        for(int i=1;i<input.length;i++) //the 1st position is considered after the for loop
                                        //so starting from 2nd postion to n-1
        {
            smallArray[i-1]=input[i];
            //this signifies smallArray[0]=input[1]
        }
        int output=input[0]+sum(smallArray);
        return output;
    }
}
