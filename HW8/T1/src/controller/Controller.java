package controller;
import model.entity.Entity;
import model.service.Service;

import java.util.List;

public class Controller {
    public void insert (String username , String password){
        try {
            Service.getInstance().save (new Entity().setUserName(username).setPassWord(password));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean searchUserName(String username)
    {
        List<Entity> entityList = null;
        try {
            entityList = Service.getInstance().report ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Entity entity : entityList)
            if (entity.getUserName().equals(username))
                return true;

            return false;
    }

    public boolean searchPassWord(String password)
    {
        List<Entity> entityList = null;
        try {
            entityList = Service.getInstance().report ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Entity entity : entityList)
            if (entity.getPassWord().equals(password))
                return true;

        return false;
    }

    public void buy (int traffic , int price)
    {
        try {
            Service.getInstance().edit(new Entity() , traffic , price);
            System.out.println("Bill : "+ traffic + " GB " + price + " Toman");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
