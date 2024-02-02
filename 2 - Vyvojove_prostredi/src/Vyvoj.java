import java.util.Scanner;

public class Vyvoj {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte slovo");
        String word = sc.nextLine();
        System.out.println(word + " obsahuje " + word.length() + " znaku");
    }
}
