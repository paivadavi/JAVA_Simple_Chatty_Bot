package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int remainder3 = 0;
        int remainder5 = 0;
        int remainder7 = 0;
        int yourAge = 0;

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        remainder3 = Integer.parseInt(scanner.nextLine());
        remainder5 = Integer.parseInt(scanner.nextLine());
        remainder7 = Integer.parseInt(scanner.nextLine());

        yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        
        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
        
    }
}
