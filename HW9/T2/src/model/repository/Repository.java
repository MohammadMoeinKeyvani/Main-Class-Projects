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
        preparedStatement=connection.prepareStatement ("INSERT INTO upuser (userName , passWord , name , age) VALUES (?,?,?,?)");
        preparedStatement.setString (1 , entity.getUserName());
        preparedStatement.setString (2 , entity.getPassWord());
        preparedStatement.setString (3 , entity.getName());
        preparedStatement.setString (4 , entity.getAge());
        preparedStatement.executeUpdate ();
    }

    public void update (Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE upuser SET password =? , name=? , age=? WHERE username=? ");
        preparedStatement.setString (1,entity.getName());
        preparedStatement.setString (2,entity.getPassWord());
        preparedStatement.setString (3,entity.getAge());
        preparedStatement.setString (4,entity.getUserName());
        preparedStatement.executeUpdate ();
    }

    public List<Entity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM upuser");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<Entity> entityList =new ArrayList <> ();
        while (resultSet.next ()){
            Entity entity =new Entity();
            entity.setUserName (resultSet.getString ("username"));
            entity.setPassWord (resultSet.getString ("password"));
            entity.setName(resultSet.getString("name"));
            entity.setAge(resultSet.getString("age"));
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
