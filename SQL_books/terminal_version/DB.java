import java.sql.*;

public class DB{
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static void connect(){
        try {
            int number_of_tries = 0;
            while (conn == null) {
                conn = DriverManager.getConnection("jdbc:sqlite:/Users/maciej_wojcik/Programowanie/Java/Laboratoria_2022/SQL_books/src/books");
                number_of_tries++;
                if(number_of_tries == 3) {
                    System.out.println("Can't establisz SQLite connection");
                    break;
                }
            }
            System.out.println ("Connection to SQLite has been established");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void list(String data){
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(data);
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " | ");
                }
                System.out.println();
            }
        }catch (SQLException ex){
            // handle any errors
        }finally {
            // zwalniamy zasoby, które nie będą potrzebne
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    // handle any errors
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    // handle any errors
                }
                stmt = null;
            }
        }
    }

    public static void addEntry(String isbn, String title, String name, String surname, String year) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT OR IGNORE INTO books VALUES (?, ?, ?, ?, ?)");
        pstmt.setString(1, isbn);
        pstmt.setString(2, title);
        pstmt.setString(3, name);
        pstmt.setString(4, surname);
        pstmt.setString(5, year);
        pstmt.executeUpdate();
    }
}

