

public class SumOddRange {

    public static void main(String[] args)
    {
        sumOdd(1, 100);
        sumOdd(100, 1000);

    }

    public static boolean isOdd(int a) {
        if (a < 0) {
            return false;
        }
        return a % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (start < 0 || end < 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
        return sum;

    }
}

