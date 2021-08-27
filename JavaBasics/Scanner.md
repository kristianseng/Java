java.util.Scanner


hasNextInt() — This method checks whether the next chunk of input data is a number (returns true or false, as appropriate). 

hasNextLine() — This method checks whether the next chunk of input is a string. 

hasNextByte(), hasNextShort(), hasNextLong(), hasNextFloat(), hasNextDouble() — All these methods perform similar checks for the remaining data types. 


public class Main {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");

       if (sc.hasNextInt()) {
           int number = sc.nextInt();
           System.out.println("Thanks! You entered the number " + number);
       } else {
           System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
       }

   }
}


useDelimiter() ---> Helps parsing data


**always remember to close resource -- > scanner1.close()**

