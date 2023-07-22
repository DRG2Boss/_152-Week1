//Isaiah Marshall
// COMP 152
//July 12th and 13th, 2023

//Cryptic jargon used later when calculating temperature.
import java.util.Scanner;

public class Hello  // If you use a colon in Python, then you need {} in Java
{
    public static void drawtwo(int size, int line)
        // Public: can grab information from other files.
        // Static: for right now, all functions should be static. Will remove later
        // Void: Return TYPE (variable types) i.e. int, char, double, String, or void (NO return type).
    {
        // Row of stars
        if(line==0) {
            for (int i = 0; i < size; i++) // "++" is from Python, it means the same as "i = i+1"
                System.out.print("*");
        }
        // Lines of spaces with star at the end.
        else if (line>=1 && line<size/2) { // "&&" means "AND" in Java and "||" means "OR"
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
            System.out.print("*");
        }
        // Row of stars
        else if (line==size/2) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
        else if (line>size/2 && line<size-1) {
            System.out.print("*");
            for(int i=0; i<size-1; i++)
                System.out.print(" ");
        } else if (line==size-1) {
            for (int i = 0; i < size; i++)
                System.out.print("*");
        }
    }
    // Notice that a "For" loop in Java is a shortcut "While" loop in Python. In Python it would look like this:
        // A for loop within a for loop is called a "nested" loop.
    // i=0
    // while i<=10:
    // print(i)
    // i = i+1

    // Program starts here
    public static void main(String[] args) // main is a function
    {
        System.out.println("Does it work?");

        // Try drawing a "2" using asterisks and the "out.println" command.
        System.out.println("*****");  // If you would NOT use a colon in Python, then need ; in Java
        System.out.println("    *");
        System.out.println("*****");
        System.out.println("*    ");
        System.out.println("*****");
        /* Notice that "/*" signifies the start of a "comment block". This will continue until the reverse symbol is used.
           NOTE: just "out.print" will NOT create a new line for the text to display on.


           Now we want to automate the resizing of that "2". Use Java for loops and if statements to do this.
           Start with declaring Scanner command (Scanner NEEDED for keyboard use) and scan variable. */
        Scanner scan;
        scan=new Scanner(System.in);
        // Now we need to print text to the user asking for input.
        System.out.println("How big would you like the number 2? Please enter an integer above 5. ");
        int size = scan.nextInt();



        // Write a Celsius to Fahrenheit converter
        /* Two ways to declare variable types (NEEDED in Java)
           Easy method seen below, can declare variable types in their own line before math
           Can also do this in-line (i.e. int test = test + 1)
            int = whole number variable
            double = float in Python, decimals involved. If end result needs to be a decimal, ALL associated variables need to be of double type.
            By default, numbers are of INTEGER type. NEED to declare "double" if you want an accurate decimal result. Ex. 1/2 = 0 since the decimal value is lost.
         */
        double temperature;
        double temperature_fahr;

        // Use scan.nextDouble to read in a floating point number and recall back when we did "Scanner" command for "2" sizing. Need a System.out.print line to present input text to user.
        System.out.print("Give me a temperature in Celsius without units: ");
        temperature = scan.nextDouble();

        // Do Math..
        temperature_fahr = temperature * 9/5 + 32;
        System.out.println(temperature_fahr);
    }
}
