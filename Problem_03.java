
import java.util.*;
public class Problem_03 {
 
public static List<Integer> generateSeries(int a) {
        int length;
        if (a % 2 != 0) {
            length = a;      
        } else {
            length = a - 1;  
        }
        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            series.add(2 * i - 1);
        }
        return series;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(generateSeries(a));
    }
}
