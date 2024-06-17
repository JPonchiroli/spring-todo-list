package dio_bootcamp_todo_list.repository;

import dio_bootcamp_todo_list.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    List<Task> taskList = new ArrayList<>();

    public void save(Task task){
        System.out.println("SAVE - Task credentials received");
        taskList.add(task);
        System.out.println(task);
    }

    public List<Task> listAll(){
        return taskList;
    }

    public void remove(Integer id){
        System.out.println("REMOVE - Task credentials deleted");
        List<Task> tasksToRemove = new ArrayList<>();
        for(Task t : taskList){
            if(t.getIdTask().equals(id)){
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public void update(Integer id, String task, String priority, boolean finished){
        System.out.println("SAVE - Task credentials updated");
        for(Task t: taskList){
            if(t.getIdTask().equals(id)){
                t.setTask(task);
                t.setPriority(priority);
                t.setFinished(finished);
                break;
            }
        }
    }

}
