import java.util.Scanner;

public class Vetveni {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte vasi profesi");
        String job = sc.nextLine();

        switch (job) {
            case "CEO" -> System.out.println("Jsi vysoko ve spolecnisti");
            case "ucitel" -> System.out.println("To jsi moc daleko nedostal");
            case "popelar" -> System.out.println("Mel jsi se lepe ucit");
            default -> System.out.println("Neznama profesi");
        }
        
    }
}
