package CodingNinjas_DatastructurePart2.Recursion;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(power(3, 4));
        //passing the value to the function from the main function
    }
    public static int power(int x, int n) 
    {
        if(n==0)
        {
            return 1;       //as we know x to the power 0 is 1
                            //so if n value remains 0 the return value would become 1
        }
        int smallOutPut=power(x, (n-1));
        int output=x*smallOutPut;   //which simply means x*(int)Math.pow(x, n-1)
        return output;
    }
}
