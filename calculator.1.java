/** Filename: calculator.java
 * ------------------------------------------
*This program calculates the total costs of driving.
* 
* @author Jeremy Cornish-Ford
* @version 1.0
* @since 2016-01-29
*/



import java.text.DecimalFormat;
import java.util.Scanner;
/** These package assist have the following functions
 * DecimalFormat-helps to format numbers, specifally the amount of decimal places desired
 * Scanner-allows for the processing of user input
 */


public class calculator 
{
    public static void main(String[] args) {
    /** This is the main method JVM looks for in the system path, and executes it
     * it must be in here, or the program will not run.
    */
        

    Scanner user_input = new Scanner(System.in); 
    /** This object is used to take in user input, and the tokens are 
     scanned, and then assigned to the appropriate variables.
     */


    double drive_dist;
    double mpg;
    double ppg;

    /**drive_dist means "driving distance"
     * mpg means "miles per gallon"
     * ppg means "price per gallon"
     */


    System.out.println("What is the driving distance?: ");
    /** This method will display a message that will ask the user to
    input enter information about his/her driving distance.
     */
    drive_dist = user_input.nextDouble();
    /** This method will read the driving distance information input into the program
     * and it will be assigned to the drive_dist.
     */
    

    System.out.println("What is the amount of miles driven?: ");
     /** This method will print out a message to the console, prompting the user to input
      * information about amount of miles driven.
     */
    mpg = user_input.nextDouble();
    /** This method will read the amount of miles driven by the user and assign it to mpg
    */
    

    System.out.println("What is the price per gallon?: ");
    /** This method will print out a message to the console, prompting the user to input
     * information about the price per gallon he/she gets.
     */
    ppg = user_input.nextDouble();
    /** This method will read the price per gallon for gas, and it will assign the cost to ppg.
     */
    

    DecimalFormat something = new DecimalFormat("#.##");
    /** This method will help structure the decimal places for the total costs incurred by the driver listed in
     * the following prompt.
     */
     
    System.out.println("The total cost of the trip is $" + something.format(drive_dist/mpg*ppg));
    /** This will calculate the total costs the driver incurs on the trip, and displays it to the console
     */
 
    }
}









