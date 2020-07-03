package controller;
import model.entity.Entity;
import model.service.Service;

import java.util.List;

public class Controller {
    public void insert (String name , String family , String meliCode , String phoneNumber , String model){
        try {
            Service.getInstance().save (new Entity().setName(name).setFamily(family).setMeliCode(meliCode).setPhoneNumber(phoneNumber).setModel(model));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
