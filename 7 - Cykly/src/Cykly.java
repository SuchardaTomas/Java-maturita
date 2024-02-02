import java.util.Scanner;

public class Cykly {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");
        int num = sc.nextInt();

        int current = 0;
        int previous = 1;

        for (int i = 0; i < num; i++) {
            current = previous + current;
            previous = current - previous;
            
            System.out.print(previous + " ");
        }
    }
}
