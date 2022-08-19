package practical4c;


public class Cat extends Feline implements Pet{
Cat()
{
System.out.println("It is a cat");
}
void makeNoise()
{
System.out.println("Meow");
}
public void befriendly()
{
System.out.println("It is a friendly Animal");
}
public void playful()
{
System.out.println("It is a playful animal");
}
}