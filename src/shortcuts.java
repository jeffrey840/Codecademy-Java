public class shortcuts {
/*

    System.out.println();
    System.out.printInt();
    System.out.print();

/**/

//*/

    /*

            Constructors

Running the program invokes main()
We create an instance so we move from main() to Store()
The code inside Store() runs
When Store() finishes execution, we return to main()

public class Store {

  // new method: constructor!
  public Store() {
System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");

    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);

  }
}


Output:
Start of the main method.
I am inside the constructor method.
Store@2aae9190

    */


//    Classes


    /*

public class Dog {
  String breed;
  boolean hasOwner;
  int age;

  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }

  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4);
    Dog nunzio = new Dog("shiba inu", true, 12);
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}

Prints:
Main method started
Constructor invoked!
Constructor invoked!
Two dogs created: a poodle and a shiba inu
The statement that fido is an older dog is: false
The total age of the dogs is: 16
Main method finished


    */

}
