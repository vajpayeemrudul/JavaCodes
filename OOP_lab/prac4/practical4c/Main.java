package practical4c;


public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
   Tiger tiger= new Tiger();
   tiger.makeNoise();
   tiger.roam();
   tiger.sleep();
     System.out.println();
   Hippo hippo= new Hippo();
   hippo.makeNoise();
   hippo.roam();
   hippo.sleep();
    System.out.println();
   Dog dog= new Dog();
   dog.makeNoise();
   dog.roam();
   dog.sleep();
   dog.befriendly();
   dog.playful();
  }
}