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
            entity.setUserName(entity.getUserName());
            entity.setPassWord(entity.getPassWord());
            entity.setTraffic(entity.getTraffic());
            entity.setPrice(entity.getPrice());
            repository.insert (entity);
            repository.commit ();
        }
    }

    public void edit (Entity entity , int tempTraffic , int tempPrice) throws Exception{
        try (Repository repo=new Repository ()){
            entity.setTraffic (entity.getTraffic() + tempTraffic);
            entity.setPrice (entity.getPrice() + tempPrice);
            repo.update (entity);
            repo.commit ();
        }
    }

    public List<Entity> report() throws Exception{
        List<Entity> entityList;
        try (Repository repository =new Repository()){
            entityList = repository.select ();
        }
        return entityList;
    }

}
