import java.util.Scanner;

public class Operatory {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");
        int num = sc.nextInt();

        if (num < 20) {
            System.out.println("cislo je mensi nez 20");
        } else if (num >= 20 && num <= 30) {
            System.out.println("cislo je mezi 20 a 30");
        } else {
            System.out.println("cislo je vetsi nez 30");
        }
    }
}
