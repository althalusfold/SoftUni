package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String [] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String hometown = studentData[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(hometown);

            students.add(student);
            input = scanner.nextLine();
        }
        String hometown = scanner.nextLine();

            for(Student student : students){
                if(student.getHometown().equals(hometown)) {
                    System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
                }
            }
        }
    }

