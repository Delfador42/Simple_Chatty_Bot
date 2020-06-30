package bot;

import java.util.Scanner;

//I am adding a comment

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        // ...

        end();

    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Enter numbers to be summed end with the number 0 : ");
        int numInput =0;
        int sum =0;
        do{
            numInput = scanner.nextInt();
            sum += numInput;
        }while(numInput != 0);

        System.out.println(sum);

    }



    static void end() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. X");
        System.out.println("2. Q");
        System.out.println("3. R");
        System.out.println("4. W");
        int input = 0;
        while(input !=2){
            input = scanner.nextInt();
            if (input == 2){
                System.out.println("Congratulations, have a nice day!"); // Do not change this text
            }else{
                System.out.println("Please, try again.");
            }
        }

    }

}
