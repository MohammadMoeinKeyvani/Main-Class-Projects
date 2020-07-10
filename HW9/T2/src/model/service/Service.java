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
            entity.setName(entity.getName());
            entity.setAge(entity.getAge());
            repository.insert (entity);
            repository.commit ();
        }
    }

    public void edit (Entity entity , String tempPassWord , String tempName , String tempAge) throws Exception{
        try (Repository repo=new Repository ()){
            entity.setPassWord (tempPassWord);
            entity.setName (tempName);
            entity.setAge (tempAge);
            entity.setUserName(entity.getUserName());
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
