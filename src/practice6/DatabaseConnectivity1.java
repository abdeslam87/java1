package practice6;

public class DatabaseConnectivity1 {

    public static void main(String[] args) throws ClassNotFoundException {
        ;
        String username = "root";
        String password = "root1234";
        String dbname = "peoplentech";
        String query = "select * from students;";

        String url = "jdbc:mysql://localhost:3306/" + dbname;


    }


}

