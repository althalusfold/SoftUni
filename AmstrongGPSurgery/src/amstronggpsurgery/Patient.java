
package amstronggpsurgery; // show source package

public class Patient //create class Patient
{
    String name; // declaring variables with no value - empty for String and char variables and 0 for numeric variables
    private final int age;
    private final char gender;
    private final String address;
    private final String email;
    private final long phoneNumber;
    private final String birthday;
    private final int patientNumber;
    private final int tax1;
    
    
    public Patient (String na, int ag, char gen, String addr,String mail, long phone, String birthd, int patientNumb, int tax_1) //constructor
    {
        name = na; //connecting variables to variables from constructor
        age = ag;
        gender = gen;
        address = addr;
        email = mail;
        phoneNumber = phone;
        birthday = birthd;
        patientNumber = patientNumb;
        tax1 = tax_1;
        
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
        System.out.println("\t\t\tPatient Birthday is: " + birthday);
        System.out.println("\t\t\tPatient number is: "+ patientNumber);
        
        if (tax1 < 1000) // check if value of variable is less than 1000
            {   
                System.out.println("\t\t\tFee paid by patient: "+ tax1 + "£"); // print value of variable 
            }
            else if (tax1 == 1000) // check if value of variable if value is equal to 1000
            {
                System.out.println("\t\t\tFee paid by patient: "+ tax1 + "£");   // print value of variable 
            }
            
            else if (tax1 < 100) // check if value of variable is less than 100
            {
                System.out.println("\t\t\tPatient needs to pay appointment fee or yearly fee!");  //print instructions to user
            }            
    }       
    
    public String getName()
    {
        return name;
    }    
}
