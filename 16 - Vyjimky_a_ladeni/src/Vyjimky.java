import java.util.Scanner;

public class Vyjimky {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Zadejte 1. číslo");
            int num = sc.nextInt();
            System.out.println("Zadejte 2. číslo");
            int num2 = sc.nextInt();

            System.out.println(num + " + " + num2 + " = " + (num+num2));

        } catch (Exception e) {
            System.out.println("Máš tam chybu");
        }


    }
}
