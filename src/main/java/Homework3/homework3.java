package Homework3;
import java.util.Scanner;

public class homework3 {

                                          // 3.1
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Number one:");
    int one = scanner.nextInt();

    System.out.println("Number two:");
    int two = scanner.nextInt();

    System.out.println("Number tree:");
    int tree = scanner.nextInt();

        System.out.println("Number one:" + one);
        System.out.println("Number two:" + two);
        System.out.println("Number tree:" +tree);

        if(one > two && two > tree){
        System.out.print("The biggest number is:" + one);
    } else if (two > tree) {
        System.out.println("Largest number is: " + two);
    } else {
        System.out.println("Largest number is: " + tree);
    }


                                     // 3.2
        System.out.println("You have rectangle with side and side .Find: perimeter(P=?) an Area(S=?).");

        System.out.println("Insert side a: ");
        int a = scanner.nextInt();
        System.out.println("Insert side a: ");
        int b = scanner.nextInt();


       System.out.print("P=2*a+2*b="+ (2 * a + 2 * b)+"sm\n");

       System.out.print("S=a*b="+ (a*b)+"sm2\n");


                                       //3.3
        System.out.println("Please enter your number:");
        int number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println("Your number " + number + " is even.");
        }else {
            System.out.println("Your number " + number + " is odd.");



        }

    }
                                  //3.4

    public static void selectWeekOfTheDay(int dayOfTheWeek){


        switch(dayOfTheWeek){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid data");
                break;


        }

    }
}






