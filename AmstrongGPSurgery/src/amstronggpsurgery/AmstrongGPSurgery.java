
package amstronggpsurgery; // show source package

import static amstronggpsurgery.Lists.*;//import library
import java.util.*;

    public class AmstrongGPSurgery
{   
    public static ArrayList<Appointments> appointmentsList = new ArrayList<>(); //creates Array list with Objects Appointments
    public static Scanner keyboard = new Scanner(System.in); 
    static String patientName; 
    static String doctorName;
    public static int options;
    public static String pn;
    public static String dn;
    public static Appointments app;
    static int patientNumber; //declares variable of tipe int 
    
    public static void main(String[] args) 
    {    
        lists();      //Loads lists of 5 Doctors and 4 Patients
        menu();       //Prints user menu 
    }
    
    static void menu() //Prints user menu 
    {
        System.out.println("\t\t\t ##################################\n"); 
        System.out.println("\t\t\t       Armstrong GP Surgery\n");
        System.out.println("\t\t\t ##################################\n");
        System.out.println("\t\t\t 1.Register new Patient");
        System.out.println("\t\t\t 2.Book appointment");
        System.out.println("\t\t\t 3.Edit appointment");
        System.out.println("\t\t\t 4.Cancel appointment");
        System.out.println("\t\t\t 5.Remove Patient from GP-list");
        System.out.println("\t\t\t 6.View all Appointments");
        System.out.println("\t\t\t 7.View Patient profile");
        System.out.println("\t\t\t 8.Management Report");
        System.out.println("\t\t\t 9.Exit");
        System.out.println("\t\t\t Please select option: ");
        
        for ( int options=1; options<=9; options++) // Creates loop in which while variable options=1 options=<9 executes the code in "for" 
            {      
                numbException(); // check user input for invalid symbols and promps user to try again
                options = keyboard.nextInt(); // taking a value for Int variable options from user input
                keyboard.nextLine(); // cleaning the pipeline

                switch(options) //Java Switch Statement - checks if user input matches cases below until it match one.
                    {
                        case 1:
                            addPatient(); //executes method 
                            restart(); //promps user to continue or exit
                            return; // closes the loop if case matche user input
                        case 2:
                            bookApp();
                            restart();
                            return;   
                        case 3:
                            editApp();
                            restart();
                            return; 
                        case 4:
                            appointmentSearch();
                            cancelApp();
                            restart();
                            return;
                        case 5:                     
                            removePatient();
                            restart();
                            return;
                        case 6:
                            appointmentSearch();
                            restart();
                            return;
                        case 7:
                            patientProfile();
                            restart();
                            return;
                        case 8: //Prints sub-menu 
                            System.out.println("\t\t\t ##################################\n"); 
                            System.out.println("\t\t\t 1.View names of Patients seen by Doctor");
                            System.out.println("\t\t\t 2.Show booking times and view manes of Doctors seen by Patien");
                            System.out.println("\t\t\t 3.View all Doctors");
                            System.out.println("\t\t\t 4.View all Patients");
                            System.out.println("\t\t\t 5.Return to Main menu");
                            System.out.println("\t\t\t Please select option: ");
                            for (int options_2=1; options_2<=5; options_2++)
                                {    
                                    numbException(); // check user input for invalid symbols and promps user to try again
                                    options_2 = keyboard.nextInt(); // taking a value for Int variable options_2 from user input
                                    keyboard.nextLine();
                                  switch(options_2)
                                    {
                                    case 1: 
                                        checkDoctor(); // prints names of Patients seen by a specific Doctor
                                        restart(); // executes  method promping user to continue or exit
                                        return;          
                                    case 2:
                                        checkPatient(); // prints names of Doctors seen by a specific Patient
                                        restart();
                                        return;  
                                    case 3:
                                        printDocList(); //executes method which prints full doctor list
                                        restart();
                                        return;
                                    case 4:
                                        printPatientList(); //executes method which prints full patient list
                                        restart();
                                        return;
                                    case 5:
                                        menu();
                                        return;
                                        
                                    default:  // executes if user inputs different option from 1-5
                                        System.out.println("\n\t\t\tInvalid option! \n");
                                        restart();                                         
                                        return;
                                    }
                                }                
                            return;
                        case 9:
                            System.out.println("\t\t\tThank you, have a nice day!\n");
                            return;
                        default:
                            System.out.println("\t\t\tPlease select option from 1 to 9...\n"); 
                            menu();  // executes method menu() which prints maim menu 
                            return;
                    }           
            }
    }       

    static void addPatient()  // adds Patient to system
    {                                                                       
        System.out.println("\t\t\tEnter Patient full name: ");
        String name_1 = keyboard.nextLine(); // takes next user input and add it to variable of type String variable name_1
        
        System.out.println("\t\t\tEnter Patient age: ");
        numbException();   // check user input for invalid symbols and promps user to try again
        int age_1 = keyboard.nextInt();    // takes next user input and add it to variable of type Int age_1        
        keyboard.nextLine(); // cleaning the pipeline
        
        System.out.println("\t\t\tEnter Patient gender: ");
        char gender_1 = keyboard.next().charAt(0);
        keyboard.nextLine(); // cleaning the pipeline
        
        System.out.println("\t\t\tEnter Patient full address: ");
        String address_1 = keyboard.nextLine(); // takes next String from user input and add it to variable address_1
        
        System.out.println("\t\t\tEnter Patient email: ");        
        String email_1 = keyboard.nextLine();  // takes next String from user input and add it to variable email_1   
        
        System.out.println("\t\t\tEnter Patient phone number: ");
        longException();  // check user input for invalid symbols and promps user to try again
        long phoneNumber_1 = keyboard.nextLong();  // takes next user input and add it to variable of type Int phoneNumber1
        keyboard.nextLine();
        
        System.out.println("\t\t\tEnter Patient birthday: ");
        String birth_1 = keyboard.nextLine(); // takes next user input and add it to variable of type String variable birth_1
        
        int patientNumber_1 = patientNumber++; //creates unique number by adding "1" to the value of variable of type int patientNumber and than add it to variable of the samy type patientNumber_1
        
        System.out.println("\t\t\tAppointment fee paid: ");
        numbException();  // check user input for invalid symbols and promps user to try again
        int fee_1 = keyboard.nextInt(); // takes next user input and add it to variable of type Int fee_1
                
        Patient p1= new Patient(name_1, age_1, gender_1, address_1, email_1, phoneNumber_1, birth_1, patientNumber_1, fee_1); //creates object "Patient" using constructor with data entered from user
        System.out.println("\t\t\tPatient number is: "+ patientNumber); // print data ("data") and value of variable patientNumber
        patient_list.add(p1);   // add object Patient to ArrayList patient_list   
    }   
          
    static void bookApp() //creates appointment
    {        
        System.out.println("\n\t\t\tEnter Patient name: "); //promps user to enter data
        patientName = keyboard.nextLine();
        String nx = patientName;  
        Patient px = searchPatientByName(nx); 
              
                             
        System.out.println("\n\t\t\tEnter Doctor name: ");//promps user to enter data
        doctorName = keyboard.nextLine();
        String sx = doctorName;
        Doctor dx = searchDoctorByName(sx);
        
        System.out.println("\t\t\tGive appointment time: ");//promps user to enter data
        String time1 = keyboard.nextLine();
        String tx = time1;
        Appointments app = searchAppointmentsByTime(tx);
        
        for (int i=0; i<appointmentsList.size(); i++)
        {
           app = appointmentsList.get(i);
        }
           
           if(time1 == app.time)
            {
                System.out.println("\n\t\t\tBooking time not free please sellect - 2 Hours before or 2 after: " + app.time);
            }  
           else
            {
                Appointments app1 = new Appointments (px, dx, time1); // creates object "Appointment" using costructor with date entered from user 
                appointmentsList.add(app1); //add object Appointment ro ArrayList appointmentsList
                System.out.println("\t\t\tAppointment is booked! "); 
            }
        
        
    }
    
    static void editApp()  //eddit an appointment 
    {
        System.out.println("\n\t\t\tEnter Patient name: ");
        patientName = keyboard.nextLine();
        String nx = patientName;
        Patient px = searchPatientByName(nx);
        
        System.out.println("\n\t\t\tEnter Doctor name: ");
        doctorName = keyboard.nextLine();
        String na = doctorName;
        Doctor dx = searchDoctorByName(na);
        
       for (int i=0; i<appointmentsList.size(); i++) // loops appointmentsList 
        {
           Appointments app = appointmentsList.get(i); 
           pn = app.getPatientName();
           dn = app.getDocName();
        }   
       
       if(pn.equalsIgnoreCase(patientName) && dn.equalsIgnoreCase(doctorName)) // check for Patient and Doctor in ArrayList appointmentsList
           {
            appointmentsList.remove(app); //remove Appointment
            System.out.println("\t\t\tGive appointment time: ");//promps user to enter data
            String time1 = keyboard.nextLine();

            Appointments app1 = new Appointments (px, dx, time1); // creates object "Appointment" using costructor with date entered from user 
            appointmentsList.add(app1); //add object Appointment to ArrayList appointmentsList
            System.out.println("\t\t\tAppointment is booked! ");
           }
           
        else 
           {
               System.out.println("\n\t\t\tThere is no booked Appointment! ");
           }
    }    
        
    static void cancelApp() // cancel an appointment 
    {                
        System.out.println("\n\t\t\tEnter Patient name: ");
        patientName = keyboard.nextLine();
        String nx = patientName;
        Patient px = searchPatientByName(nx);
        
        System.out.println("\n\t\t\tEnter Doctor name: ");
        doctorName = keyboard.nextLine();
        String na = doctorName;
        Doctor dx = searchDoctorByName(na);
        
       for (int i=0; i<appointmentsList.size(); i++)
        {
           Appointments app = appointmentsList.get(i);
           pn = app.getPatientName();
           dn = app.getDocName();
        } 
       
       if(pn.equalsIgnoreCase(patientName) && dn.equalsIgnoreCase(doctorName))
           {
               appointmentsList.remove(app);
               System.out.println("\n\t\t\tAppointment was canceled!");
           }
           
           else 
           {
               System.out.println("\n\t\t\tThere is no booked Appointment! ");
           }
    }
    
    public static void removePatient() // removes patient from memory 
    {        
        System.out.println("\n\t\t\tEnter Patient name: ");
        patientName = keyboard.nextLine();
        String nx = patientName;
        Patient px = searchPatientByName(nx);
        if(px != null)
        {   
            patient_list.remove(px);
            System.out.println("\n\t\t\tPatient " + patientName + " was removed from GP!" );
        }          
        else 
        {
            System.out.println("\n\t\t\tPatient not found!");
        }
    }
    
    
    static void appointmentSearch() // display appointmentsList
    {
        for (int i=0; i<appointmentsList.size(); i++)
        {
           Appointments px = appointmentsList.get(i);
           px.printAppDetails();
        }       
    }
    
    static void patientProfile() //search for profile and if foudd displays full data
    {        
        System.out.println("\n\t\t\tEnter Patient name: ");
        patientName = keyboard.nextLine();
        String nx = patientName;
        Patient px = searchPatientByName(nx);
        if(px != null)
        {   
            px.printDetails();
        }        
    }
    
    static Appointments searchAppointmentsByTime (String time) //search in patient_list by name
        {
            for (int i = 0; i <appointmentsList.size(); i++)
            {
               Appointments app = appointmentsList.get(i);
               String t1 = app.time;
               if (t1.equalsIgnoreCase(time))
               {
                   return app; 
               }
            }
            return null;
        }  
    
    static Patient searchPatientByName (String name) //search in patient_list by name
        {
            for (int i = 0; i <patient_list.size(); i++)
            {
               Patient px = patient_list.get(i);
               String na = px.getName();
               if (na.equalsIgnoreCase(name))
               {
                   return px; // prints found data
               }
            }
            return null;
        }  
            
    static Doctor searchDoctorByName (String name) //search in doctor_list by name
        {
            for (int i = 0; i <doctor_list.size(); i++)
            {
               Doctor dx = doctor_list.get(i);
               String na = dx.getName();
               if (na.equalsIgnoreCase(name))
               {
                   return dx; // prints found data
               }
            }
            return null;
        }  
    
    static void checkDoctor()
    {
        System.out.println("\n\t\t\tEnter Doctor name: ");//promps user to enter data
        doctorName = keyboard.nextLine();
        String sx = doctorName;
        Doctor dx = searchDoctorByName(sx);
        for (int i=0; i<appointmentsList.size(); i++)
        {
           Appointments app = appointmentsList.get(i);
           String dn = app.getDocName();
           
           if(dn.equalsIgnoreCase(doctorName))
           {
               app.printAppDetails();
           }
        }   
    }
         
    static void checkPatient()
    {
        System.out.println("\n\t\t\tEnter Patient name: ");
        patientName = keyboard.nextLine();
        String nx = patientName;
        Patient px = searchPatientByName(nx);
        for (int i=0; i<appointmentsList.size(); i++)
        {
           Appointments app = appointmentsList.get(i);
           String dn = app.getPatientName();
           
           if(dn.equalsIgnoreCase(patientName))
           {
               app.printAppDetails();
           }
        }   
    }
        
    static void restart() // // executes  method promping user to continue or exit
    {
        System.out.println("\n\t\t\tWould you like to continue? If YES press 0! Any other symbol ends the transaction!!! ");
        char options2 = keyboard.next().charAt(0);
        if (options2=='0') 
        {
            menu();
        }
        else 
        {
            System.out.println("\n\t\t\tThank you, have a nice day!");
            return;
        }        
    }
    
    static void numbException() // check user input for invalid symbols and promps user to try again
    {
    while (!keyboard.hasNextInt()) 
        {
            System.out.println("\t\t\tInvalid input. Please try again! ");
            keyboard.next();
        }
    }   
    static void longException() // check user input for invalid symbols and promps user to try again
    {
    while (!keyboard.hasNextLong()) 
        {
            System.out.println("\t\t\tInvalid input. Please try again! ");
            keyboard.next();
        }
    }   
}    
      



