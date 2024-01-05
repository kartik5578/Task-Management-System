package com.springrest.springrest;

import java.util.List;


public interface TaskService {

    List<Task> getTasks();

    public Task getTask(long taskId);

    public Task addTask(Task task);

    public Task updateTask(Task task);

    public void deleteTask(long parseLong);

}