
import java.util.Scanner;

public class Problem_01 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your inputs a and b : ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    sc.nextLine();
    System.out.println("Choose operator: +, -,*, / :  ");
    String operator = sc.nextLine();
    switch(operator){
        case "+": System.out.print(a+b);
        break;
        case "-": System.out.print(a-b);
        break;
        case"*": System.out.print(a*b);
        break;
        case"/": System.out.print(a/b);
        break;
        default: System.out.print("Invalid operator");

    }

   } 
}
