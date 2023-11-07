// program to find sum of n natural number using recursion

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

        // for the above if section we are certain that the function return exact
        // value when n value stands for its minimum

        int smallValue=sumn(n-1); 
        //in the above statement we are assuming the function stands true for n-1 value

        int output=n+smallValue;
        //in the above statement we are proving that we will get the desired output
        // by adding n to sum(n-1) (which we have proved in the above line of this)

        return output;
    }
}
