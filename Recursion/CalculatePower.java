package CodingNinjas_DatastructurePart2.Recursion;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(power(3, 3));
    }
    public static int power(int x, int n) 
    {
        if(n==0)
        {
            return 1;
        }
        int smallOutPut=power(x, (n-1));
        int output=x*smallOutPut;
        return output;
    }
}
