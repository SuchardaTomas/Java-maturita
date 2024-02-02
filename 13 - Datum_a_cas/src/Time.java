import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) throws Exception {
        LocalDateTime denCas = LocalDateTime.now();
        System.out.println(denCas.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
    }
}
