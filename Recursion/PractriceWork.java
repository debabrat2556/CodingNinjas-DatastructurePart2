package CodingNinjas_DatastructurePart2.Recursion;

public class PractriceWork {
    public static void main(String[] args) {
        int num=3;
        print(num);
    }

    public static void print(int n)
    {
        if(n<0)
        {
            return;
        }
        if(n==0)
        {
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.print(n+" ");
    }
}
