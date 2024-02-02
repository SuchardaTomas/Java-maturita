import java.util.Arrays;
import java.util.Scanner;

public class Algoritmus {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Integer[] num = new Integer[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Zadejte " + (i + 1) + ". cislo");
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);
        
        for(int numbers : num) {
            System.out.print(numbers+" ");
        }
    }
}
