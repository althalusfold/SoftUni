
public class Solution {

    public static void main(String[] args)
    {
        Weird(3);
        Weird(10);
        Weird(15);
        Weird(30);
        Weird(24);
        Weird(18);

    }
    public static int Weird(int N)
    {
        if (N%2 != 0)
        {
            System.out.println("Weird "+N);
        }
        else if ((N%2 == 0) & (N>=2) & (N<=5))
        {
            System.out.println("Not Weird "+N);
        }
        else if ((N%2 == 0) & (N>=6) & (N<=20))
        {
            System.out.println("Weird " +N);
        }
        else if ((N%2 == 0) & (N>20))
        {
            System.out.println("Not Weird "+N);
        }
        return N;
    }
}

