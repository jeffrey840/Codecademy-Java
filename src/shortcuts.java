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


//                       Methods
    /*


       public class SavingsAccount {

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
// check blalace method
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }
// deposit method
    public void deposit(int amountToDeposit) {
      balance = balance + amountToDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
  }

  // withdraw method
  public int withdraw(int amountToWithdraw) {
      balance = balance - amountToWithdraw;
      System.out.println("You just withdrew "+ amountToWithdraw);
      return amountToWithdraw;
  }

  // to str
  public String toString(){
    return "The end";
  }



  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

//Check balance:
    savings.checkBalance();

    //Withdrawing:
    savings.withdraw(300);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

    System.out.println(savings);
  }
}
     */

/*

Prints:

Hello!
Your balance is 2000
You just withdrew 300
Hello!
Your balance is 1700
You just deposited 600
Hello!
Your balance is 2300
You just deposited 600
Hello!
Your balance is 2900
The end

 */



//    while (dieRoll != 5) {
//
//        System.out.println(dieRoll);
//        dieRoll = randomGenerator.nextInt(6) + 1;
//
//    }

    // initialize cupsOfCoffee
//    int cupsOfCoffee = 1;
//
//    // add while loop with counter
//    while (cupsOfCoffee <= 100) {
//
//        System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
//        cupsOfCoffee++;
//
//    }

    // Iterate over expenses
//    for (int i = 0; i < expenses.size(); i++) {
//
//        total += expenses.get(i);
//
//    }

    // Add your code below
//     if (i % 5 != 0) {
//        continue;
//    }
//     System.out.println(i);
//
//    // Iterate over expenses
//    for (double expense : expenses) {
//
//        if (expense > mostExpensive) {
//            mostExpensive = expense;
//        }
//
//    }
//
//        for (int i = 0; i < lunchBox.size(); i++) {
//        if (lunchBox.get(i) == "ant"){
//            lunchBox.remove(lunchBox.get(i));
//            i--;
//        }
//    }

   /*
    // Using a while loop
    int i = 0;
    while (i < lunchBox.size()) {
      if (lunchBox.get(i) == "ant"){
        lunchBox.remove(lunchBox.get(i));
      } else {
        i++;
      }
    }
   */

//    return lunchBox;
//
//
//    // What's the character count?
//    System.out.println(tweet.length());
//
//    // Add your first names:
//    String firstName = "Ziggy";
//    String lastName = "Stardust";
//
//    // What's the full name?
//    System.out.println(firstName.concat(" " + lastName));
//
//    // Write the code:
//    System.out.println(password.equals("Tr0ub4dor&3"));
//
//    // Write the code:
//    System.out.println(code.indexOf(". .- -"));
//
//    // Add a first name and a last name:
//    String firstName = "Sonny";
//    String lastName = "Li";
//
//    // What are the initials?
//    System.out.println(firstName.charAt(0));
//    System.out.println(lastName.charAt(0));
//
//    // Change the arguments:
//    System.out.println(line.substring(4, 11));
//
//    // Make the hashtag lowercase:
//    System.out.println(hashtag.toLowerCase());
//
//
//
////    getters and setters
//    public int getBalance(){
//        return balance;
//    }
//
//    public void setBalance(int newBalance){
//        balance = newBalance;
//    }
//
//    public static void main(String[] args) {
//        Bank bankOfGods = new Bank();
//        System.out.println(bankOfGods.accountOne.getBalance());
//        bankOfGods.accountOne.setBalance(5000);
//        System.out.println(bankOfGods.accountOne.getBalance());
//
//    }


//    ACCESS, ENCAPSULATION, AND SCOPE


//    Nice work! In this lesson, we dove into some of the more subtle features of classes with a focus on access, encapsulation, and scope. Here are some of the main takeaways from this lesson:
//
//    The public and private keywords are used to define what parts of code have access to other classes, methods, constructors, and instance variables.
//    Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.
//            The this keyword can be used to designate the difference between instance variables and local variables.
//    Local variables can only be used within the scope that they were defined in.
//    The this keyword can be used to call methods when writing classes.

//    class RandomNumbers {
//        public static void main(String[] args) {
//            // Random double value between 0 and 1
//            System.out.println(Math.random());
//
//            // Random double value between 0 and 9
//            double a = Math.random() * 10;
//            System.out.println(a);
//
//            // Random int value between 0 and 9
//            int b = (int)(Math.random() * 10);
//            System.out.println(b);
//
//            // Random int value between 1 and 10
//            int c = (int)(Math.random() * 10) + 1;
//            System.out.println(c);
//
//            // Random int value between 10 and 20
//            int d = (int)(Math.random() * 11 ) + 10;
//            System.out.println(d);
//        }
//    }


//    INHERITANCE AND POLYMORPHISM

//    Excellent work! You’ve learned quite a bundle about inheritance and polymorphism in Java:
//
//    A Java class can inherit fields and methods from another class.
//    Each Java class requires its own file, but only one class in a Java package needs a main() method.
//    Child classes inherit the parent constructor by default, but it’s possible to modify the constructor using super() or override it completely.
//    You can use protected and final to control child class access to parent class members.
//    Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class, but also give it its own traits.
//    You can override parent class methods in the child class, ideally using the @Override keyword.
//    It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.




//                  2D ARRAYS

//    public class Exercise2 {
//        public static void main(String[] args) {
//
//            // Declare a 2d array of float values called floatTwoD
//            float[][] floatTwoD;
//
//            // Initialize the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
//            floatTwoD = new float[4][10];
//
//            // Declare and initialize an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart
//            int[][] dataChart = new int[15][8];
//
//            // Create a 2D char array called ticTacToe representing the provided tic-tac-toe board using initializer lists. Use the characters 'X', 'O', and ' '.
//            char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
//
//            // When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
//            ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};
//
//        }
//    }

//    public class Exercise3 {
//        public static void main(String[] args) {
//            // Using the provided 2D array
//            int[][] intMatrix = {
//                    {1, 1, 1, 1, 1},
//                    {2, 4, 6, 8, 0},
//                    {9, 8, 7, 6, 5}
//            };
//
//            // Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
//            int retrievedInt = intMatrix [0][3];
//
//
//            // Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
//            System.out.println(intMatrix[1][2] * 3);
//
//        }
//    }

//import java.util.Arrays;
//    public class Modifying {
//        public static void main(String[] args) {
//            // Using the provided 2D array
//            int[][] intMatrix = {
//                    {1, 1, 1, 1, 1},
//                    {2, 4, 6, 8, 0},
//                    {9, 8, 7, 6, 5}
//            };
//
//            // Replace the number 4 in the 2D array with the number 0
//            intMatrix[1][1] = 0;
//
//            // Declare and initialize a new empty 2x2 integer 2D array called subMatrix
//            int[][] subMatrix = new int[2][2];
//
//            // Using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created. Afterwards, uncomment the provided print statement below.
//            subMatrix[0][0] = intMatrix[0][0] * 5;
//            subMatrix[0][1] = intMatrix[0][1] * 5;
//            subMatrix[1][0] = intMatrix[1][0] * 5;
//            subMatrix[1][1] = intMatrix[1][1] * 5;
//
//            System.out.println(Arrays.deepToString(subMatrix));
//        }
//    }

//    public class NestedLoops {
//        public static void main(String[] args) {
//            int[] seatsDayOne = {850007, 841141, 150017, 622393, 178505, 952093, 492450, 790218, 515994, 926666, 476090, 709827, 908660, 718422, 641067, 624652, 429205, 394328, 802772, 468793, 901979, 504963, 733939, 706557, 724430, 663772, 577480, 886333, 323197, 283056, 378922, 628641, 494605, 606387, 179993, 755472, 253608, 975198, 328457, 885712, 411958, 418586, 254970, 299345, 632115, 915208, 661570, 328375, 538422, 321303};
//
//            int[] seatsDayTwo = {740912, 209431, 310346, 316462, 915797, 850440, 803140, 459194, 293277, 302424, 790507, 711980, 639916, 707446, 940339, 613076, 524157, 189604, 595934, 509691, 234133, 787575, 674602, 944308, 710345, 889699, 622393, 151931, 964325, 944568, 357684, 933857, 541190, 935076, 468848, 449446, 278951, 885503, 539124, 278723, 998622, 846182, 394328, 914002, 803795, 851135, 828760, 504936, 504322, 648644};
//
//            int matchCounter = 0;
//            // Fix the outer loop header to iterate through the first array of seats
//            for(int i = 0; i < seatsDayOne.length; i++) {
//
//                // Fix the inner loop header to iterate through the second array of seats
//                for(int j = 0; j < seatsDayTwo.length; j++) {
//
//                    // Replace 1==2 with conditional logic to check if an element in the first array matches an element in the second array
//                    if(seatsDayOne[i] == seatsDayTwo[j]) {
//                        matchCounter++;
//                        System.out.println("Contestant: " + seatsDayOne[i] + ", Seat Day One: " + i + ", Seat Day Two: " + j);
//                        break;
//                    }
//                }
//            }
//            System.out.println("The total number of contestants reserving seats on both days was: " + matchCounter);
//        }
//    }

//    public class Introduction {
//        public static void main(String[] args) {
//            //Given the provided 2d array
//            int[][] intMatrix = {
//                    { 4,  6,  8, 10, 12, 14, 16},
//                    {18, 20, 22, 24, 26, 28, 30},
//                    {32, 34, 36, 38, 40, 42, 44},
//                    {46, 48, 50, 52, 54, 56, 58},
//                    {60, 62, 64, 66, 68, 70, 79}
//            };
//            // Store the number of subarrays of intMatrix into a variable called 'numSubArrays'
//            int numSubArrays = intMatrix.length;
//            // Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength.
//            int subArrayLength = intMatrix[0].length;
//
//            // Store the number of columns in intMatrix into a variable called 'columns'
//            int columns = subArrayLength;
//
//            // Store the number of rows in intMatrix into a variable called 'rows'
//            int rows = numSubArrays;
//
//            // Replace the outer and inner for loop headers to iterate through the entire 2D array. Use the iterators `i` for the outer loop and `j` for the inner loop.
//            int sum = 0;
//            for(int i=0; i<intMatrix.length; i++) {
//                for(int j = 0; j < intMatrix[i].length; j++) {
//                    // Insert a line of code to increase the variable `sum` by each accessed element
//                    sum+=intMatrix[i][j];
//                }
//            }
//            System.out.println(sum);
//        }
//    }

//    public class LoopPractice {
//        public static void main(String[] args) {
//            String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
//
//            //Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
//            int characterCount = 0;
//
//            for (String[] wordRow : wordData) {
//                for (String word: wordRow) {
//                    characterCount += word.length();
//                }
//            }
//
//            System.out.println(characterCount);
//
//            //Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.
//
//            int i = 0, j = 0;
//
//            while (i < wordData.length) {
//                j = 0;
//                while (j < wordData[i].length) {
//                    System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
//                    j++;
//                }
//                i++;
//            }
//
//        }
//    }

//    public class RowMajor {
//        public static void main(String[] args) {
//            // Given runner lap data
//            double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
//
//            // Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
//            double runnerTime = 0.0;
//            for(int outer = 0; outer < times.length; outer++) {
//                runnerTime = 0.0;
//                for(int inner = 0; inner < times[outer].length; inner++) {
//                    System.out.println("Runner index: " + outer + ", Time index: " + inner);
//                    // Enter the missing line of code to sum up the values in each row. Use the variable runnerTime
//                    runnerTime+=times[outer][inner];
//
//                }
//                // Enter the missing line of code to find the average time of each runner. Use the variable averageVal
//                double averageVal = 0;
//                averageVal = runnerTime / times[outer].length;
//                System.out.println("Sum of runner " + outer + " times: " + runnerTime);
//                System.out.println("Average of runner " + outer + ": " + averageVal);
//            }
//        }
//    }

//    public class ColumnMajor {
//        public static void main(String[] args) {
//            // Given runner lap data
//            double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
//
//            // Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
//            double lapTime = 0.0;
//            for(int outer = 0; outer < times[0].length; outer++){
//                lapTime = 0.0;
//                for(int inner = 0; inner < times.length; inner++){
//                    System.out.println("Lap index: " + outer + ", Time index: " + inner);
//                    // Enter the missing line of code to sum up the values in each column. Use the variable lapTime
//                    lapTime+=times[inner][outer];
//
//                }
//                // Enter the missing line of code to find the average time of each lap. Use the variable averageVal
//                double averageVal = 0;
//                averageVal = lapTime / times.length;
//                System.out.println("Sum of lap " + outer + " times: " + lapTime);
//                System.out.println("Average time for lap " + outer + ": " + averageVal);
//            }
//        }
//    }

//import java.util.Arrays;
//    public class Combining {
//        public static void main(String[] args) {
//            int[][] imageData={{100,90,255,80,70,255,60,50},
//                    {255,10,5,255,10,5,255,255},
//                    {255,255,255,0,255,255,255,75},
//                    {255,60,30,0,30,60,255,255}};
//
//            //First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
//            int[][] newImage = new int[4][6];
//
//
//            //Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
//            for(int i=0; i<newImage.length; i++){
//                for(int j=0; j<newImage[i].length; j++){
//                    newImage[i][j] = imageData[i][j];
//                }
//            }
//
//            System.out.println(Arrays.deepToString(newImage));
//
//            //You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
//            for(int i=0; i<newImage.length; i++){
//                for(int j=0; j<newImage[i].length; j++){
//                    if(newImage[i][j]-50<0){
//                        newImage[i][j] = 0;
//                    }
//                    else{
//                        newImage[i][j]-=50;
//                    }
//                }
//            }
//
//            System.out.println(Arrays.deepToString(newImage));
//        }
//    }
//

//    2D Array Review
//    Let’s review the concepts we have learned throughout this lesson.
//
//    Arrays are objects in Java, we can have arrays of objects, therefore we can also have arrays of arrays. This is the way 2D arrays are structured in Java.
//
//    We can declare and initialize 2D arrays in a few different ways depending on the situation:
//
//    // Declaring without initializing
//    int[][] intTwoD;
//
//// Initializing an empty 2D array which has already been declared
//    intTwoD = new int[5][5];
//
//    // Declaring and initializing an empty 2D array at once
//    String[][] stringData = new String[3][6];
//
//    // Declaring and initializing a 2D array using initializer lists
//    double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
//
//    // Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
//    char[][] letters = new char[100][250];
//    letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
//    We retrieve elements in a 2D array by providing a row and column index char c = letters[0][1];
//
//    We can also think of them as the index of the outer array and the index of the subarray
//    We can modify elements the same way letters[1][2] = 'z';
//    We traverse 2D arrays using nested loops.
//
//    We can use loops of any type, but we typically use nested for loops to keep track of the indices
//    Row-major order traverses through each row moving horizontally to the right through each row
//    Column-major order traverses through each column moving vertically down through each column
//    Row-major order and column-major order start and end on the same elements, but the paths are different.
//    In order to convert row-major to column-major, we need to make the outer loop terminating condition depend on the number of columns, make the inner loop terminating condition depend on the number of rows, and flip the variables in our accessor within the inner loop to ensure that we don’t try to access outside of the 2D array since we flipped the direction of traversal.
//    Here are examples of row-major and column-major order:
//
//// Row-major order
//            for(int o = 0; o < letters.length; o++) {
//        for(int i = 0; i < letters[o].length; i++) {
//            char c = letters[o][i];
//        }
//    }
//
//// Column-major order
//for(int o = 0; o < letters[0].length; o++) {
//        for(int i = 0; i < letters.length; i++) {
//            char c = letters[i][o];
//        }
//    }
//    Conditional logic in our 2D array traversal allows us to use the data in a meaningful way. We can control which rows and columns we look at, ensure that the data we are looking at is what we want, perform calculations on specific elements, avoid throwing exceptions, and more.
//
//    Here is an example of traversal with conditional logic.
//
//            Given this 2D array of Strings:
//
//    String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};
//    We are going to flip the capitalization of the words:
//
//            System.out.println("Before...");
//System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
//
//for(int i=0; i<words.length; i++) {
//        for(int j = 0; j<words[i].length; j++) {
//            if(words[i][j]!=null) {
//
//                // Check the capitalization
//                boolean allCaps = true;
//                for(char c : words[i][j].toCharArray())
//                    if(!Character.isUpperCase(c))
//                        allCaps = false;
//
//                // Flip the capitalization
//                if(allCaps)
//                    words[i][j] = words[i][j].toLowerCase();
//                else
//                    words[i][j] = words[i][j].toUpperCase();
//            }
//        }
//    }
//
//System.out.println("After...");
//System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
//    Here is the output of the above code:
//
//    Before...
//            [[championship, QUANTITY, month],
//            [EMPLOYEE, queen, understanding],
//            [method, writer, MOVIE]]
//
//    After...
//            [[CHAMPIONSHIP, quantity, MONTH],
//            [employee, QUEEN, UNDERSTANDING],
//            [METHOD, WRITER, movie]]


//    import java.util.Arrays;
//    public class Review {
//        public static void main(String[] args) {
//
//            //First, declare and initialize a 4x3 2D array of doubles called `scores` which will contain the exam data for four students. The rows will represent the student and the columns will represent the exam number. You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print the result in the console.
//            double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}} ;
//
//
//            System.out.println(Arrays.deepToString(scores));
//
//            //The next set of exams have occurred. Using 4 lines of code, manually enter the scores (89.7, 90.5, 93.6, 88.1) for the second exam (column 1). Use the provided print statement to print the updated 2D array as well.
//            scores[0][1] = 89.7;
//            scores[1][1] = 90.5;
//            scores[2][1] = 93.6;
//            scores[3][1] = 88.1;
//
//            System.out.println(Arrays.deepToString(scores));
//
//            //You have realized that you will only be keeping track of 2 exam grades instead of 3. Declare and initialize an empty 4x2 2D array of double values  called newScores
//            double[][] newScores = new double[4][2];
//
//
//            //Using loops, copy all of the scores for exam 1 and 2 into the new 2D array. (do not include the -1 values)
//            for(int i = 0; i < newScores.length; i++){
//                for(int j = 0; j < newScores[i].length; j++){
//                    newScores[i][j] = scores[i][j];
//                }
//            }
//
//            System.out.println(Arrays.deepToString(newScores));
//
//            //You have allowed the students to complete an extra credit activity to contribute towards their scores. For all exam grades less than 90, add 2 additional points to the grade in `newScores`
//            for(int i = 0; i < newScores.length; i++){
//                for(int j = 0; j < newScores[i].length; j++){
//                    if(newScores[i][j]<90){
//                        newScores[i][j]+=2;
//                    }
//                }
//            }
//
//            System.out.println(Arrays.deepToString(newScores));
//        }
//    }


//    The inner-most nested loop must complete all of its iterations before the outer loop continues.
//
//    The outer enhanced for loop iterates through each array of Strings, while the inner enhanced for loop iterates through each String value in the subarray.
//
//    When modifying an element in a 2D array, you access the element using the variable name first, the row index in brackets second, and the column index in brackets third. You then set it equal to a value.
//
//            = {{1,2,3},{4,5,6}};
//
//    int[][] second;
//    second = new int[][] {{7,8,9},{10,11,12}};
//
//    Row-major order starts at the top left of the 2D array (when viewing it as a matrix) and traverses across each row until it ends at the bottom right corner.
//


//    public class MyTwoDArray {
//    public static void main(String[] args) {
//        //Declare a 2D int array
//    int[][] myTwoD;

}
