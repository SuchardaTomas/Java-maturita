import java.util.Scanner;

public class Promenne {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] slova = new String[4];

        for (int i = 0; i < slova.length; i++) {
            System.out.println("Zadejte " + (i + 1) + ". slovo");
            slova[i] = sc.next();
        }

        for (String slovo : slova) {
            System.out.print(slovo+ ".");
        }
    }
}
