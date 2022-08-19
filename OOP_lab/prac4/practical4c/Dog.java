package practical4c;


public class Dog extends Canine implements Pet {
      Dog()
      {
          System.out.println("This is a dog");
      }
      void makeNoise()
      {
        System.out.println("Barking");
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