package model.repository;

import model.entity.UserEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "javaclass", "123");
        connection.setAutoCommit (false);
    }

    public void insert(UserEntity userEntity) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO users (name , userName , passWord , email) VALUES (?,?,?,?)");
        preparedStatement.setString (1 , userEntity.getName());
        preparedStatement.setString (2 , userEntity.getUserName());
        preparedStatement.setString (3 , userEntity.getPassWord());
        preparedStatement.setString (4 , userEntity.getEmail());
        preparedStatement.executeUpdate ();
    }

    public List<UserEntity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM users");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEntity> userEntityList=new ArrayList <> ();
        while (resultSet.next ()){
            UserEntity userEntity=new UserEntity ();
            userEntity.setName (resultSet.getString ("name"));
            userEntity.setUserName (resultSet.getString ("username"));
            userEntity.setPassWord (resultSet.getString ("password"));
            userEntity.setEmail (resultSet.getString ("email"));
            userEntityList.add (userEntity);
        }
        return userEntityList;
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
