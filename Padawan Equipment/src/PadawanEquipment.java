import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.next());
        int students = Integer.parseInt(scanner.next());
        double lightSaberPrice = Double.parseDouble(scanner.next());
        double robesPrice = Double.parseDouble(scanner.next());
        double beltPrice = Double.parseDouble(scanner.next());
        double lightSaber10 = Math.ceil(students * 1.1);
        double discount = 0;

        for(int i = 1; i <= students; i++){
            if(i % 6==0){
                discount++;
            }
        }

        double totalPrice = lightSaber10* lightSaberPrice + students * robesPrice + (students - discount) * beltPrice;
        if(money < totalPrice){
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }else{
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
    }
}


//•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
//•	The count of students – integer in the range [0…100].
//•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
//•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
//•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].