import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("14 - Prace_se_soubory/text.txt")) {
            String[] words = new String[5];

            for (int i = 0; i < words.length; i++) {
                System.out.println("Zadejte " + (i + 1) + ". slovo");
                words[i] = scanner.nextLine();
            }

            for (String slova : words) {
                writer.write(slova + " ");
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
