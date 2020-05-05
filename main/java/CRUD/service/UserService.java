package CRUD.service;

import CRUD.dao.UserDAO;
import CRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDao;

    @Transactional
    public List<User> getAll(){
        return userDao.getAll();
    }

    @Transactional
    public void delete(User user){
        userDao.delete(user);
    }

    @Transactional
    public void add(User user){
        userDao.add(user);
    }

    @Transactional
    public void update(User user){
        userDao.update(user);
    }
    @Transactional
    public User getbyID(int id){
        return userDao.getbyID(id);
    }



}
