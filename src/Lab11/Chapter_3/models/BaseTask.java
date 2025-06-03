package Lab11.Chapter_3.models;

import Lab11.Chapter_3.enums.TaskStatus;

import java.time.LocalDateTime;

public abstract class BaseTask {
    protected int id;
    protected String title;
    protected TaskStatus status;
    protected LocalDateTime createdAt;
    protected LocalDateTime updateAt;

    public BaseTask(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = TaskStatus.PENDING;
        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public void markAsDone() {
        this.status = TaskStatus.COMPLETED;
        this.updateAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task ID" + id + ", Title:" + title + ",Status:" + status + ",Created At: " + createdAt + ", Updated At: " + updateAt;
    }
}
