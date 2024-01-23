
package ObjectPractice;

public class Cup 
{
  String colour;
  double volume;
  String material;
  double level;
  String drinkType;
  
  
  public Cup(String col, double vol, String mtr)
  {
      colour = col;
      volume = vol;
      material = mtr;
  }  
  
  public void printObjectDetails()
  {
      System.out.println("Colour is: " + colour);
      System.out.println("Volume is: " + volume);
      System.out.println("Material is: " + material);       
      System.out.println("Drink type is: " + drinkType + " / Level is: " + level + "%");      
  }
  
  public void addDrink(String drinkTyp, double lev)
  {
      drinkType = drinkTyp;
      level = lev;
  }
  public void drink()
  {
      if (level >=10)
      {
            level = level - 10;
            System.out.println("After drinking " +drinkType +" lever is: " + level + " %");
            System.out.println("**************************************************");
      }
      else 
      {
            System.out.println("The cup is empty!");
            System.out.println("");
      }
  }
}
