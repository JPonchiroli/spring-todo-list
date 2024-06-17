package dio_bootcamp_todo_list.controller;

import dio_bootcamp_todo_list.model.Task;
import dio_bootcamp_todo_list.model.User;
import dio_bootcamp_todo_list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PostMapping
    public void postTask(@RequestBody Task task){
        repository.save(task);
    }

    @GetMapping()
    public List<Task> getUsers(){
        return repository.listAll();
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PutMapping("/updateTask{idTask}")
    public void updateUserById(
            @PathVariable("idTask")Integer idTask,
            @RequestParam("task") String task,
            @RequestParam("priority") String priority,
            @RequestParam("finished") boolean finished) {
        repository.update(idTask, task, priority, finished);
    }

}
