import java.util.Scanner;

public class Rozdily {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte 1. číslo");
        Double num = sc.nextDouble();
        System.out.println("Zadejte 2. číslo");
        Double num2 = sc.nextDouble();

        System.out.println(num + " + " + num2 + " = " + scitani(num, num2));
        System.out.println(num + " - " + num2 + " = " + odecitani(num, num));
        System.out.println(num + " * " + num2 + " = " + nasobeni(num, num2));
        System.out.println(num + " / " + num2 + " = " + deleni(num, num2));
        
    }

    public static double scitani(double num, double num2) {
        return (num + num2);
    }

    public static double odecitani(double num, double num2) {
        return (num - num2);
    }

    public static double nasobeni(double num, double num2) {
        return (num * num2);
    }

    public static double deleni(double num, double num2) {
        return (num / num2);
    }

    
}
