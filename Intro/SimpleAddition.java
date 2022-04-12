import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        int a, b;
        Scanner userinput = new Scanner(System.in);
        System.out.println("please insert first number");
        a = userinput.nextInt();
        System.out.println("please insert second number");
        b = userinput.nextInt();
    
        System.out.println("The sum of the numbers are ");
        System.out.println(a + b); 
    }  
}
