import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            DatabaseManager.setData("jmeno", "prijmeni", "email");
            DatabaseManager.getData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
