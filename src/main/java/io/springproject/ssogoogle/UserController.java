package io.springproject.ssogoogle;

import io.springproject.ssogoogle.model.User;
import io.springproject.ssogoogle.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/users/")
    public User getUserByUsername(@PathVariable("username")String username){
        return repository.getUserByUsername(username);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return (List<User>) repository.findAll();
    }
}
