
import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 1){
            System.out.print(1+" ");
        }
        if(a >= 2){
            for(int i = 1;i<a;i++){
                System.out.print((2*i)+1+" ");
            }
        }
    }
}
