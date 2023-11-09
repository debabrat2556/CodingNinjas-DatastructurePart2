package CodingNinjas_DatastructurePart2.Recursion;

import java.util.Scanner;

public class PrintFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
    public static void print(int n)
    {
        if(n<=0)
        {
            return;     //if value becomes 0 or less than 0 we directly return
        }
        print(n-1);        // function recalling itself and decreasing n value by 1 ata a time
        System.out.print(n+" ");
    }

}
