
package amstronggpsurgery; //source package

public class Appointments 

{     
    Patient pt; // declaring objects Patient and Doctor with no value and String time with no value
    Doctor dr;
    String time;
    
        
    public Appointments(Patient p, Doctor d, String ti) //constructor
    {   
        pt = p; //connecting variables to variables from constructor
        dr = d;
        time = ti;        
    }      
       
    public void printAppDetails() // print appointment data 
    {
        System.out.println("\n\t\t\tPatient name is: " + pt.getName());
        System.out.println("\t\t\tDoctor name is: " + dr.getName());
        System.out.println("\t\t\tBooked time is: " + time + "h\n");
    }  

    public String getDocName()
    {
        return dr.getName();
    }
    
    public String getPatientName()
    {
        return pt.getName();
    }
    
}
