// dH 9/5/24
// ReverseString.java

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to my reverse string program!");

        // Let's reverse a string.
        String myStrToReverse = "This is a test";

        // Output the chars of myStrToReverse
        for (int i = 0; i < myStrToReverse.length(); i++) {
            System.out.println("myStrToReverse[" + i + "] is: " + myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output.");

        // Create the reverse string.
        String reversedStr = "";

        // Output reversedStr.
        System.out.println("reversedStr before reversion loop is: " + myStrToReverse);

        for (int i = myStrToReverse.length()-1; i >= 0; i--) {
            char charToAdd = myStrToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));
        }
        // Output reversedStr.
        System.out.println("reversedStr after reversion loop is: " + reversedStr);



    }
}