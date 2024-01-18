import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ageGroup= "";
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 0 && age <= 2){
            ageGroup = "baby";
        }else if(age >= 3 && age <= 13){
            ageGroup = "child";
        }else if(age >= 14 && age <= 19){
            ageGroup = "teenager";
        }else if(age >= 20 && age <= 65){
            ageGroup = "adult";
        }else if(age >= 66){
            ageGroup = "elder";
        }
        System.out.println(ageGroup);
    }
}
//Write a program that determines whether a person is based on the given age: baby, child, teenager, adult, or elder. The bounders are:
//•	0-2 – baby;
//•	3-13 – child;
//•	14-19 – teenager;
//•	20-65 – adult;
//•	>=66 – elder;
//•	All the values are inclusive.
//Examples
//Input	Output
//20	adult
//1	baby
//100	elderWrite a program that determines whether a person is based on the given age: baby, child, teenager, adult, or elder. The bounders are:
//•	0-2 – baby;
//•	3-13 – child;
//•	14-19 – teenager;
//•	20-65 – adult;
//•	>=66 – elder;
//•	All the values are inclusive.
//Examples
//Input	Output
//20	adult
//1	baby
//100	elder