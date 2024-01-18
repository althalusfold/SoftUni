
package ingheritance;

public class Student extends Person
{         
    String course = "None";    
    
    public Student (String na, int ag, char gen)
    {
       super(na, ag, gen);
    }
    public void assingCourse(String crn)
    {
        course = crn;    
    }
}
