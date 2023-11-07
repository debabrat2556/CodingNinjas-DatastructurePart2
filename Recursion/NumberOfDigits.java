package CodingNinjas_DatastructurePart2.Recursion;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(0));
    }
    public static int countDigits(int n)
    {
        int countn=1;
        if(n==0)
        {
            return 0;           //not taking 0 as an input
        }
        int smallOutput=countDigits(n/10);      //so the concept is 
                                                // we are checking how many times the number is divisible by 10
                                                //so it would always result in total number of digits-1


        countn=countn+smallOutput;              //so we have introduced countn with a value 1
        return countn;
    }
}
