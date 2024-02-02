import java.util.Arrays;
import java.util.Scanner;

public class Pole {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Double[] numbers = new Double[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Zadejte " + (i + 1) + ". cislo");
            numbers[i] = sc.nextDouble();
        }

        Arrays.sort(numbers);
        double nejmensi = numbers[0];
        double nejvetsi = numbers[4];

        System.out.println("Nejmensi cislo v poli je " + (int)nejmensi);
        System.out.println("Nejvetsi cislo v poli je " + (int)nejvetsi);
        System.out.println("Prumer techto cisel je " + ((nejmensi + nejvetsi) / 2));
    }
}
