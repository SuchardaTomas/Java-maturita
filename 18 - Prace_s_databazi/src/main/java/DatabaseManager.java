import java.sql.*;

public class DatabaseManager {

    public static void getData() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement statement = cn.prepareStatement("SELECT * FROM users");
        ResultSet set = statement.executeQuery();

        while (set.next()) {
            System.out.println(set.getInt("id"));
            System.out.println(set.getString("name"));
            System.out.println(set.getString("surname"));
            System.out.println(set.getString("email"));
        }
    }

    public static void setData(String name, String surname, String email) throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement statement = cn.prepareStatement("INSERT INTO users VALUES (NULL, ?, ?, ?)");

        statement.setString(1, name);
        statement.setString(2, surname);
        statement.setString(3, email);
        statement.execute();
    }
}
