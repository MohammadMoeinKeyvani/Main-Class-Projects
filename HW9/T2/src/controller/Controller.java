package controller;
import model.entity.Entity;
import model.repository.Repository;
import model.service.Service;

import java.util.List;

public class Controller {
    public void insert (String username , String password , String name , String age){
        try {
            Service.getInstance().save (new Entity().setUserName(username).setPassWord(password).setName(name).setAge(age));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void update ( String passWord , String name , String age)
    {
        try {
            Service.getInstance().edit(new Entity() , passWord , name , age);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
