package pbosesi4;

public class Animal {
  public void displayInfo() {
      System.out.println("Aku adalah Hewan");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("Aku adalah Anjing");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}