package controller;
import model.entity.UserEntity;
import model.service.UserService;

import java.util.List;

public class UserController {
    public void insert (String name , String username , String password , String email){
        try {
            UserService.getInstance().save (new UserEntity().setName(name).setUserName(username).setPassWord(password).setEmail(email));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean searchUserName(String username)
    {
        List<UserEntity> userEntityList = null;
        try {
            userEntityList = UserService.getInstance().report ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (UserEntity userEntity : userEntityList)
            if (userEntity.getUserName().equals(username))
                return true;

            return false;
    }

    public boolean searchPassWord(String password)
    {
        List<UserEntity> userEntityList = null;
        try {
            userEntityList = UserService.getInstance().report ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (UserEntity userEntity : userEntityList)
            if (userEntity.getPassWord().equals(password))
                return true;

        return false;
    }

}
