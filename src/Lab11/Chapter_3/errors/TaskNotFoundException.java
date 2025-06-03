package Lab11.Chapter_3.errors;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message){
        super(message);
    }
}
