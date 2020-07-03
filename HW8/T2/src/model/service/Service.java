package model.service;

import model.entity.Entity;
import model.repository.Repository;

import java.util.List;

public class Service {

    private static Service service = new Service();

    public static Service getInstance () {
        return service;
    }

    public void save (Entity entity) throws Exception {
        try (Repository repository = new Repository()) {
            entity.setName(entity.getName());
            entity.setFamily(entity.getFamily());
            entity.setMeliCode(entity.getMeliCode());
            entity.setPhoneNumber(entity.getPhoneNumber());
            entity.setModel(entity.getModel());
            repository.insert (entity);
            repository.commit ();
        }
    }

}
