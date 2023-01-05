import java.sql.*;

public class DB{
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static void connect(){
        try {
            //@TODO: stop after 3 tries
            conn = DriverManager.getConnection("jdbc:sqlite:/Users/maciej_wojcik/Programowanie/Java/Laboratoria_2022/SQL_books/src/books");
            System.out.println ("Connection to SQLite has been established");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
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
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
            }
        }
    }

    public void addUser() throws SQLException {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO books (nazwisko) "
                        + "values ('Bobek')");
    }

}

