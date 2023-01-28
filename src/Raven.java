package src;
public class Raven extends Animal implements Flying
{
  public void fly()
  {
    System.out.println("The raven... It soars");
  }
  public void die()
  {
    System.out.println("The raven falls to the ground with a plop");
  }
}
