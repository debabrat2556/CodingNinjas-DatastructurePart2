package CodingNinjas_DatastructurePart2.Recursion;

public class RecursionUnderstanding {
    public static void main(String[] args) {
        System.out.println(sumn(10));
    }
    // ***********************************************
    // so in the next section we are writing the function
    public static int sumn(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int smallValue=sumn(n-1);
        int output=n+smallValue;
        return output;
    }
}
