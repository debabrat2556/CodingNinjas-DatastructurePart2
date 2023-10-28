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

    public static void EquilibriumFunction(int[] passedArray)
    {
        int lengthOfArray=passedArray.length;
        int sum=0;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<lengthOfArray;i++)
        {
            System.out.println("value of array index "+i+" is"+passedArray[i]);
            sum=sum+passedArray[i];            
        } 
        for(int j=0;j<lengthOfArray;j++)
        {
            rightSum=sum-leftSum;
            leftSum=leftSum+passedArray[j];
            if(leftSum==rightSum)
            {
                System.out.println("the value at which we achieved equilibrium is "+passedArray[j]+ "at position"+j);
            }
        }
    }
}
