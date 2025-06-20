package com.example.champs.dao;

import com.example.champs.exception.UserNotFoundException;
import com.example.champs.model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private Long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();


    public UserModel save(final UserModel user) {
        user.setId(nextId++);
        models.add(user);
        return user;
    }

    public UserModel update(final UserModel user){
        UserModel toUpdate = findById(user.getId());
        models.remove(toUpdate);
        models.add(user);
        return user;
    }

    public UserModel findById (final Long id){
        String message = "User with id " + id + " not found";

        return models.stream()
        .filter(u -> u.getId() == id)
        .findFirst()
        //so vai disparar a exception se o usuário não for encontrado
        .orElseThrow(() -> new UserNotFoundException(message));
    }

    public void delete(final long id){
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public List<UserModel> findAll(){
        return models;
    }
}

