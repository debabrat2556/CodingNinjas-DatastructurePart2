import java.util.Scanner;

public class PairSumInArray {
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
        System.out.println(pairSum(arr1,num));
    }    

    public static int pairSum(int[] arr, int num)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)          //j=i+1 so for 1st iteration j value starts from 1
                                            //for the second iteration j value starts from 2 as i=1
                                            //for the third iteration j value starts from 3 as i=2 and goes
                                            //upto array length

            {
                //System.out.println(j+" is the value of j ");
                if(num==(arr[i]+arr[j]))
                {
                    count++;
                }
            }
        }
        return (int)count/2;
    }

}