package dio_bootcamp_todo_list.repository;

import dio_bootcamp_todo_list.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> usersList = new ArrayList<>();

    public void save(User user){
        System.out.println("SAVE - User credentials received");
        usersList.add(user);
        System.out.println(user);
    }

    public List<User> listAll(){
        return usersList;
    }

    public void remove(Integer id){
        System.out.println("REMOVE - User credentials deleted");
        List<User> usersToRemove = new ArrayList<>();
        for(User u : usersList){
            if(u.getId().equals(id)){
                usersToRemove.add(u);
            }
        }
        usersList.removeAll(usersToRemove);
    }

    public void update(Integer id, String username, String password){
        System.out.println("SAVE - User credentials updated");
        for(User u: usersList){
            if(u.getId().equals(id)){
                u.setUsername(username);
                u.setPassword(password);
                break;
            }
        }
    }
}
