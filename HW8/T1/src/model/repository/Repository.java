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
        preparedStatement=connection.prepareStatement ("INSERT INTO sim (userName , passWord , traffic , price) VALUES (?,?,?,?)");
        preparedStatement.setString (1 , entity.getUserName());
        preparedStatement.setString (2 , entity.getPassWord());
        preparedStatement.setInt (3 , entity.getTraffic());
        preparedStatement.setInt (4 , entity.getPrice());
        preparedStatement.executeUpdate ();
    }

    public void update (Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE sim SET traffic =?, price=? WHERE username=? ");
        preparedStatement.setInt (1,entity.getTraffic());
        preparedStatement.setInt (2,entity.getPrice());
        preparedStatement.setString (3,entity.getUserName());
        preparedStatement.executeUpdate ();
    }

    public List<Entity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM sim");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<Entity> entityList =new ArrayList <> ();
        while (resultSet.next ()){
            Entity entity =new Entity();
            entity.setUserName (resultSet.getString ("username"));
            entity.setPassWord (resultSet.getString ("password"));
            entity.setTraffic(resultSet.getInt("traffic"));
            entity.setPrice(resultSet.getInt("price"));
            entityList.add (entity);
        }
        return entityList;
    }

    public void commit() throws Exception{
        connection.commit ();
    }

    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
