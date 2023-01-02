//package i.e. location of the file
package programming.intro;

import java.util.Scanner;

//Class
public class Intro {
    //main method of the class
    public static void main(String[] args) {
        //outputs the text in the console

        System.out.println("Please enter your name");
        //scanner class used for getting the user input
        Scanner scanner = new Scanner(System.in);
        //variable name for storing the name entered
        String name = scanner.nextLine();
        //outputs the text in the console
        System.out.println("Hi, " + name);

        //outputs the text in the console
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        //outputs the text in the console
        System.out.println("Hi, " + name + " your age is: " + age);

        //checks some logic
        if (age >=18){
            System.out.println(name + " is able to drink.");
        }else {
            System.out.println(name + "is NOT able to drink");
        }
    }
}
