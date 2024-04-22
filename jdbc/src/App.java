import java.sql.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process result
         * close connection
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "pg";
        String password = "n0m3l0";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");
        // Statement st = con.createStatement();

        // String query = "select * from student";
        int sid = 101;
        String sname = "Rahul";
        int marks = 40;
        // String query = "insert into student values(" + sid + ",'" + sname + "'," +
        // marks + ")";
        String query = "insert into student values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, sid);
        pst.setString(2, sname);
        pst.setInt(3, marks);
        ResultSet rs = pst.executeQuery();
        // rs.next();
        // String name = rs.getString("sname");
        // System.out.println(name);
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getString(3));
        }
        con.close();
        System.out.println("Connection closed");
    }
}
