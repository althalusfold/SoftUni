import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char a = ' ';
        int sum = 0;
        for(int i = 0; i < number; i++){
            a = scanner.next().charAt(0);
            sum += (int) a;
        }
        System.out.println("The sum equals: "+sum);
    }
}

//4.	Sum of Chars
//Write a program that sums the ASCII codes of n characters. Print the sum on the console.
//Input
//•	On the first line, you will receive n – the number of lines that follow.
//•	On the next n lines – you will receive letters from the Latin alphabet.
//Output
//Print the total sum in the following format:
//"The sum equals: {totalSum}"
//Constraints
//•	n will be in the interval [1…20].
//•	The characters will always be either upper or lower-case letters from the English alphabet.
//•	You will always receive one letter per line.