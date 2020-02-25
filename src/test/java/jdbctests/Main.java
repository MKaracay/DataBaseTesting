package jdbctests;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Creating the connection
        String dbUrl = "jdbc:oracle:thin:@3.92.226.83:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";

        //Creating connection to database
        Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        //Creating statement object
        Statement statement = DriverManager.getConnection(dbUrl, dbUsername, dbPassword).createStatement();

        //Running query and get the result in result object
        ResultSet resultSet = statement.executeQuery("select * from employees");

        //moving pointer to next row

       // resultSet.next();

       // System.out.println(resultSet.getString("region_name"));

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + "-" +resultSet.getString(2) +
                    " " + resultSet.getString(3) + "\t-" + resultSet.getString("salary"));
        }
        //closing connection
        resultSet.close();
        statement.close();
        connection.close();

        //Entering the data
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter first name");
//        String first_name = s.next();
//        System.out.println("enter last name");
//        int last_name = s.nextInt();
//        System.out.println("enter manager_id");
//        String manager_id =  s.next();
//
//        //Inserting data using SQL query
//        String sql = "insert into student1 values('"+first_name+"',"+last_name+",'"+manager_id+"')";
//        Connection con=null;
//        try
//        {
//            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//
//            //Reference to connection interface
//            con = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
//
//            Statement st = con.createStatement();
//            int m = st.executeUpdate(sql);
//            if (m == 1)
//                System.out.println("inserted successfully : "+sql);
//            else
//                System.out.println("insertion failed");
//            con.close();
//        }
//        catch(Exception ex)
//        {
//            System.err.println(ex);
//        }
    }
}


