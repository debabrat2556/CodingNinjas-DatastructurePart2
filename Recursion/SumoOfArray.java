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
        int smallArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
        {
            smallArray[i-1]=input[i];
        }
        int output=input[0]+sum(smallArray);
        return output;
    }
}
