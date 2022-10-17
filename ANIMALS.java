package pbosesi4;

class ANIMALS {
   protected void displayInfo() {
      System.out.println("Aku adalah Hewan");
   }
}

class Dog extends ANIMALS {
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
