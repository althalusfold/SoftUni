package ingheritance;


public class Teacher extends Person
{
    
    int teachingHours = 0;    

    public Teacher (String na, int ag, char gen)
    {
        super(na, ag, gen);
    }
    public void assighHours (int hours)
    {
        teachingHours = hours;
    }    
}