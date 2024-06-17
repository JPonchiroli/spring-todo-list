package dio_bootcamp_todo_list.model;

import java.util.Date;

public class Task {
    private Integer idTask;
    private Integer userId;
    private String task;
    private Date releaseDate;
    private String priority;
    private boolean finished;

    public Task(Integer idTask, Integer userId, String task, Date releaseDate, String priority, boolean finished) {
        this.idTask = idTask;
        this.userId = userId;
        this.task = task;
        this.releaseDate = releaseDate;
        this.priority = priority;
        this.finished = finished;
    }

    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", userId=" + userId +
                ", task='" + task + '\'' +
                ", releaseDate=" + releaseDate +
                ", priority='" + priority + '\'' +
                ", finished=" + finished +
                '}';
    }
}
