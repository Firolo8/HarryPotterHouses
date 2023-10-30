import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Welcome to Hogwarts! Let the Sorting Hat choose your house.");
        System.out.println("Enter you name: ");
        String user = (scan.nextLine()).toLowerCase();

        System.out.println("Answer the following questions with 'yes' or 'no': ");
        System.out.println("Do you value bravery and chivalry? ");
        String gryf = (scan.nextLine()).toLowerCase();

        System.out.println("Do you value hard work, dedication, and loyalty");
        String huffle = (scan.nextLine()).toLowerCase();

        System.out.println("Do you value intelligence, creativity, and learning?");
        String raven = (scan.nextLine()).toLowerCase();*/

        System.out.println("Welcome to Hogwarts! Let the Sorting Hat choose your house.");
        System.out.println("Enter you name: ");
        String user = scan.nextLine();

        System.out.println("Answer the following questions with 'yes' or 'no': ");
        System.out.println("Do you value bravery and chivalry? ");
        String gryf = (scan.nextLine()).toLowerCase();
        if (gryf.equals("yes"))
        {
            System.out.println("Dear " + user + ", \nYou belong to Gryffindor!");
        }
        else
        {
            System.out.println("Do you value hard work, dedication, and loyalty");
            String huffle = (scan.nextLine()).toLowerCase();

            if (huffle.equals("yes"))
            {
                System.out.println("Dear " + user + ", \nYou belong to Hufflepuff!");
            }
            else
            {
                System.out.println("Do you value intelligence, creativity, and learning?");
                String raven = (scan.nextLine()).toLowerCase();
                if (raven.equals("yes"))
                {
                    System.out.println("Dear " + user + ", \nYou belong to Ravenclaw!");
                }
                else
                {
                    System.out.println("Dear " + user + ", \nYou belong to Slytherin!");
                }
            }
        }



        }
    }

