package src;
import java.util.Scanner;
public class Demo
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("You reach a cliff \nare you a raven or a pig?");
    String choice = kb.nextLine();
    Animal animal = new Raven();
    if(choice.toLowerCase().equals("raven"))
      animal = new Raven();
    else
      animal = new Pig();
    if(animal instanceof Flying)
    {
      animal.fly();
    }else{
      animal.die();
    }
    kb.close();
  } 
}
