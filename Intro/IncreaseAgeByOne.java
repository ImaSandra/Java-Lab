import java.util.Scanner;

public class IncreaseAgeByOne {
   public static void main(String[] args) {
        System.out.println("Mary's age increment");
        int a;
        Scanner keyboard = new Scanner (System.in);
        a = keyboard.nextInt();
        System.out.println("mary's age is;");
        System.out.println(++a);

    }
}