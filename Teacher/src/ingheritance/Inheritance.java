            
package ingheritance;

import java.util.ArrayList;

public class Inheritance 
{   
    public static void main(String[] args)
    {
       ArrayList<Teacher> teacher_list = new ArrayList<Teacher>();    
       Teacher t1 = new Teacher("Shadi Basura", 36,'M');
       Teacher t2 = new Teacher("Alice John", 45,'F');
       
              
       ArrayList<Student> student_list = new ArrayList<Student>();
       Student s1 = new Student("Niko Tekov", 25,'M');
       Student s2 = new Student("Techo Chikov", 35,'M');
       
       student_list.add(s2);
       teacher_list.add(t1);
       teacher_list.add(t2);
       
       for (int i = 0; i < teacher_list.size(); i++)
       {
          Teacher t = teacher_list.get(i);
          System.out.println("Teachers details: ");
          t.printDetails();
          System.out.println();
          System.out.println();
       }
       for (int i = 0; i < student_list.size(); i++)
       {          
          Student s = student_list.get(i);
          System.out.println("Students details: ");
          s.printDetails();
          System.out.println();
       }               
    }    
}
