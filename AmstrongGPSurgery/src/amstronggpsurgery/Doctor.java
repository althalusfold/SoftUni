
package amstronggpsurgery; // show source package

public class Doctor //create class Doctor
{
    private final String name; // declaring variables with no value - empty for String and char variables and 0 for numeric variables
    private final int age;
    private final char gender;
    private final String address;
    private final String email;
    private final long phoneNumber;
    private final String doctorPractice;    
    
    public Doctor (String na, int ag, char gen, String addr,String mail, long phone, String practice) //constructor
    {
        name = na; //connecting variables to variables from constructor
        age = ag;
        gender = gen;
        address = addr;
        email = mail;
        phoneNumber = phone;
        doctorPractice = practice;
    }
    public void printDetails() // print given data
    {
        System.out.println();
        System.out.println("\t\t\tName: " + name);
        System.out.println("\t\t\tAge: " + age);
        System.out.println("\t\t\tGender: " + gender);
        System.out.println("\t\t\tAddress: " + address);
        System.out.println("\t\t\tEmail: " + email);
        System.out.println("\t\t\tPhone number: " + phoneNumber);
        System.out.println("\t\t\tDoctor practice: " + doctorPractice);
    }  
    
    public String getName() 
    {
        return name;
    }  
}
