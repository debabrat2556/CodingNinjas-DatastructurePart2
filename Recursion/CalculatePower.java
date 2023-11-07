package CodingNinjas_DatastructurePart2.Recursion;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(power(3, 4));
        System.out.println(power2(2, 6));
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

     // also can be done in the following manner
     static int power2(int x, int n)
     {
        int smallOutPut=0;
        if(n==0)
        {
            return 1;
        }
        else if (n%2==0) //assuming power is divisble by 2 means an even number
        {
            smallOutPut=power2(x, n/2)*power2(x, n/2);    //for example
                                                        //2 to the power 8 = (2 to the pow 4)*(2 to the pow 4) 
        }
        else            //assuming power is not divisble by 2 means an odd number
        {
            smallOutPut=x*power2(x, n-1);       //for example
                                                //2 to the pow 7=2 * 2 to the pow 6
        }
        return smallOutPut;
     }
}
