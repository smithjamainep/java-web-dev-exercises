package exercises;

//Add an import statement at the the top of the file to include Scanner
import java.util.Scanner;


public class HelloWorldExt {

    //EXECUTES ON RUN
    public static void main(String[] args){



    //SCANNER IS DECLARED
        Scanner input = new Scanner(System.in);
        //PROMPTED TO ASK THE PERSON WHAT THEIR NAME IS?
        System.out.println("What is your name?");
        //ASSIGNED IT TO A VARIABLE & using the Scanner’s .nextLine() method
        String name = input.nextLine();
        //RETURNED THE INFORMATION
        System.out.println("Howdy, "+ name);
    }
}


