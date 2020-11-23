import java.sql.*;

public class MainClass {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement ps;

    public static void main(String[] args) {
        try {
            connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        deleteTable();
        createTable();
        addNote("Egor", 20);
        addNote("Roman", 30);
        addNote("Ruslan", 40);
        delNote("Egor");
        update();
        disconnect();
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void createTable(){
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Students\n" +
                    "(\n" +
                    "  StudID INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "  Name TEXT,\n" +
                    "  Score INTEGER\n" +
                    ")");
        } catch (SQLException e) {
            e.printStackTrace();
        } System.out.println("Таблица создана!");
    }

    static void deleteTable(){
        try {
            stmt.executeUpdate("DROP TABLE IF EXISTS Students");
        } catch (SQLException e) {
            e.printStackTrace();
        } System.out.println("Таблица успешно удалена!");
    }

    static void addNote(String name, int score){
        try {
            ps = connection.prepareStatement("INSERT INTO Students (Name, Score) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setInt(2, score);
            ps.addBatch();
            ps.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } System.out.println("Запись добавлена!");
    }

    static void getNote(String name){
        try {
            ps = connection.prepareStatement("SELECT * FROM Students WHERE Name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void delNote(String name){
        try {
            ps = connection.prepareStatement("DELETE FROM Students WHERE Name = ?");
            ps.setString(1, name);
            ps.addBatch();
            ps.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Запись успешно удалена!");
    }

    static void update(){
        try {
            ps = connection.prepareStatement("UPDATE Students SET Name = ?, Score = ? WHERE StudID = ?");
            for (int i = 1; i < 4; i++) {
                ps.setString(1, "Bob" + i);
                ps.setInt(2, 45 + 5*i);
                ps.setInt(3, i);
                ps.addBatch();
                ps.executeBatch();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } System.out.println("Данные успешно обновлены!");
    }
}
