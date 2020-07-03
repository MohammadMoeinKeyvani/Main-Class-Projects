package model.service;

import model.entity.UserEntity;
import model.repository.UserRepository;

import java.util.List;

public class UserService {

    private static UserService userService = new UserService ();

    public static UserService getInstance () {
        return userService;
    }

    public void save (UserEntity userEntity) throws Exception {
        try (UserRepository userRepository = new UserRepository()) {
            userEntity.setName(userEntity.getName());
            userEntity.setUserName(userEntity.getUserName());
            userEntity.setPassWord(userEntity.getPassWord());
            userEntity.setEmail(userEntity.getEmail());
            userRepository.insert (userEntity);
            userRepository.commit ();
        }
    }

    public List<UserEntity> report() throws Exception{
        List<UserEntity> userEntityList;
        try (UserRepository userRepository=new UserRepository ()){
            userEntityList=userRepository.select ();
        }
        return userEntityList;
    }

}
