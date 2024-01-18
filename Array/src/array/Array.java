
package array;

import java.util.ArrayList;

public class Array
{
  
    public static void main(String[] args) 
    {                    
        ArrayList<Integer> age_list = new ArrayList<Integer>();
        age_list.add(12);
        age_list.add(8);
        age_list.add(3);
        
        for (int i=0; i<age_list.size(); i++)
                {
                     System.out.println(age_list.get(i));              
                }
       
        int[] age_array ={1,5,6,9,7,8,8,9,33,57,9,0,44,26};
                    
        System.out.println();
                for (int i=0; i<age_array.length; i++)
                {
                     System.out.println(age_array[i]);                     
                }           
        ArrayList<String> name_list = new ArrayList<String>();
        name_list.add("Hristo");
        name_list.add("Ivanov");
        name_list.add("Petrov");
        name_list.add("Petrova");
        name_list.add("Dimitrov");
        name_list.add("Nikolov");
        name_list.add("Stefanov");
        
        for (int i=0; i<name_list.size(); i++)
                {
                    if (name_list.get(i)=="Hristo")
                    {
                         System.out.println("Name was found!");  
                         break;
                    }
                    else 
                    {
                         System.out.println("Name was not found...!");
                    }                    
                }        
        if (name_list.contains("Ivanov"))
            {
                name_list.remove(1);
                for (int i=0; i<name_list.size(); i++)
                {
                    System.out.println(name_list.get(i));                
                }
            }
        else 
            {
                System.out.println("Name not found!");
            }
    }
}    

        