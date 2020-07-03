package model.repository;

import model.entity.Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "javaclass", "123");
        connection.setAutoCommit (false);
    }

    public void insert(Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO carfactory (name , family , melicode , phonenumber , model) VALUES (?,?,?,?,?)");
        preparedStatement.setString (1 , entity.getName());
        preparedStatement.setString (2 , entity.getFamily());
        preparedStatement.setString (3 , entity.getMeliCode());
        preparedStatement.setString (4 , entity.getPhoneNumber());
        preparedStatement.setString (5 , entity.getModel());
        preparedStatement.executeUpdate ();
    }



    public void commit() throws Exception{
        connection.commit ();
    }

    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
