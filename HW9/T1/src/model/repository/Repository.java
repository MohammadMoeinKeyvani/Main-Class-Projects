package model.repository;
import model.entity.Employee;

import java.sql.*;

public class Repository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "javaclass", "123");
        connection.setAutoCommit (false);
    }

    public void insert(Employee e1) throws Exception{
        preparedStatement=connection.prepareStatement ("insert into employee (name , family , fathername , numberphone , age) VALUES (?,?,?,?,?)");
        preparedStatement.setString (1 , e1.getName());
        preparedStatement.setString (2 , e1.getFamily());
        preparedStatement.setString (3 , e1.getFatherName());
        preparedStatement.setString (4 , e1.getNumber());
        preparedStatement.setInt (5 , e1.getAge());
        preparedStatement.execute ();
    }

    public void commit() throws Exception{
        connection.commit ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
