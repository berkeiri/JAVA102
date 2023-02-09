import java.sql.*;

public class DbConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/universite";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "berke";

    public static void main(String[] args) {
        Connection connect = null;
        //verileri çekmek için gereken komut
        String sql="SELECT * FROM student";
        //veri eklemek için gereken komut
        String insertSql="INSERT INTO student(student_name,student_class) VALUES ('cafer',4)";
        //veri güncelleme
        String updateSql="UPDATE student SET student_name='CACO iri' WHERE student_id=4 ";
        //veri silme
        String deleteSql="DELETE FROM student WHERE student_id=5";
        try {
            //okuma işlemi
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement st= connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            //burda veriyi ekledik
            //st.executeUpdate(insertSql);

            st.executeUpdate(updateSql);
            while (data.next()){
                System.out.println("ID:" + data.getInt("student_id"));
                System.out.println("student name:"+ data.getString("student_name"));
                System.out.println("student class:"+ data.getInt("student_class"));
            }
            //burda kapadık.
            st.close();
            connect.close();
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

}
