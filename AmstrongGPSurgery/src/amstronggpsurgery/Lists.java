
package amstronggpsurgery;

import static amstronggpsurgery.AmstrongGPSurgery.appointmentsList;
import java.util.*; 

public class Lists  //create class Lists
{
    public static ArrayList<Integer> patientNumbers_list = new ArrayList<>();  //creates Array list patientNumbers_list with Objects Integer 
    public static ArrayList<Doctor> doctor_list = new ArrayList<>(); //creates Array list doctor_list with Objects Doctor
    public static ArrayList<Patient> patient_list = new ArrayList<>(); //creates Array list patient_list with Objects Patient
    public static Scanner keyboard = new Scanner(System.in);
          
        
    static void lists() // method declaring objects Doctor, Patient
    { 
        // creating object Doctor and assigning values of type String, Int, char, String, String, Int;
        Doctor d1 = new Doctor("James Michaels", 36,'M',"43 Grean Hill B33 6BK","jfill@armstrongsurgery.co.uk",1018612322,"Dental Sergiant"); //create object Doctor whit given values for name, age , gende etc.                              
        Doctor d2 = new Doctor("Alice Jones", 45,'F',"54 Little Huntingthon B14 9OL","ajones@armstrongsurgery.co.uk",1018612323,"GP");         
        Doctor d3 = new Doctor("John Deep", 65,'M',"356 Stratford Rd B90 8UL","jdeep@armstrongsurgery.co.uk",1018612324,"Dental sergiant");                     
        Doctor d4 = new Doctor("Alice Rivers", 31,'F',"3 Hudson Street B11 8GH","arivers@armstrongsurgery.co.uk",1018612325,"GP");                    
        Doctor d5 = new Doctor("Niko Kovach", 45,'M',"15 Donalds Creek  B27 9LZ","nkovach@armstrongsurgery.co.uk",1018612326,"GP");
        
        // adding Objects Doctor to ArrayList doctor_list
        doctor_list.add(d1);                                                                         
        doctor_list.add(d2);
        doctor_list.add(d3);
        doctor_list.add(d4);
        doctor_list.add(d5); 
                      
        // creating objects Patient and assigning values of type String, Int, char, String, String, Int;
        Patient p1 = new Patient("James Hill", 26,'M',"43 Grean Oak B31 6ZK","jhill@gmail.com",1018612289,"03.08.1992",96,100);                                    
        Patient p2 = new Patient("Niki James", 40,'F',"50 Small Huntingthon B11 98L","njames@gmail.com",1018612434,"05.02.1979",97,0);         
        Patient p3 = new Patient("John Deer", 35,'M',"35 Stratford Rd B90 8UL","jdeer@gmail.com",1018612525,"03.09.1984",98,100);                     
        Patient p4 = new Patient("Alice Barr", 21,'F',"3 Samson Street B19 8SH","abarr@gmail.com",1018612527,"09.12.1998",99,0);
        
        // adding Objects Patient to ArrayList patient_list
        patient_list.add(p1);                                                                         
        patient_list.add(p2);
        patient_list.add(p3);
        patient_list.add(p4); 
        
        Appointments app2 = new Appointments(p1,d2,"12");
        Appointments app3 = new Appointments(p2,d3,"16:45");
        Appointments app4 = new Appointments(p3,d4,"10");
        Appointments app5 = new Appointments(p4,d1,"9:30");
        Appointments app6 = new Appointments(p2,d5,"14:15");
        
        appointmentsList.add(app2);
        appointmentsList.add(app3);
        appointmentsList.add(app4);
        appointmentsList.add(app5);
        appointmentsList.add(app6);
    }
    
    static void printDocList() //prints Doctor list 
    {                        
        System.out.println("\n\t\t\tDoctors: ");        
        for (int i=0; i<doctor_list.size(); i++)
            {
                Doctor d = doctor_list.get(i);
                d.printDetails();                             
            }
        System.out.println("");
    }
    
    static void printPatientList() // prints Patients list 
    {   
        System.out.println("\n\t\t\tPatients: ");        
        for (int i=0; i<patient_list.size(); i++)
            {
                Patient p = patient_list.get(i);
                p.printDetails();
            }    
        System.out.println("");
    }        
}

