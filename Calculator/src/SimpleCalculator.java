public class SimpleCalculator {

    public static void Sum(double firstNum, double secondNum) {
        System.out.println("Sum of the two numbers is: " + (firstNum + secondNum));
    }
    public static void Substract(double firstNum, double secondNum) {
        System.out.println("Substraction of the two numbers is: " + (firstNum - secondNum));
    }
    public static void Multiply(double firstNum, double secondNum) {
        System.out.println("Multiplication of the two numbers is: " + (firstNum * secondNum));
    }

    public static void Division(double firstNum, double secondNum){
        if (secondNum != 0){
            System.out.println((firstNum / secondNum));
        }
        else {
            System.out.println("Not allowed! Cannot devide by 0!");
        }
    }
}
