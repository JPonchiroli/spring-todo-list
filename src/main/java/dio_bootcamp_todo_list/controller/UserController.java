package dio_bootcamp_todo_list.controller;

import dio_bootcamp_todo_list.model.User;
import dio_bootcamp_todo_list.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }

    @GetMapping()
    public List<User> getUsers(){
        return repository.listAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PutMapping("/updateUser{id}")
    public void updateUserById(
            @PathVariable("id")Integer id,
            @RequestParam("username")String username,
            @RequestParam("password")String password){
        repository.update(id, username, password);
    }
}
