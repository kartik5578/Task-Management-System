package com.springrest.springrest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;
    List <Task> list;

    public TaskServiceImpl(){
        // list = new ArrayList<>();
        // list.add(new Task(45, "Complete the project", "Do it fast"));
        // list.add(new Task(46, "Complete 2nd internship task", "Will get both internships"));
    }

    @Override
    public List<Task> getTasks() {
        return taskDao.findAll();
    }

    
    @Override
    public Task getTask(long taskId) {
        Task entity = taskDao.getReferenceById(taskId);
        return entity;
        
    }


    @Override
    public Task addTask(Task task) {
            taskDao.save(task);
            return task;
    }

    @Override
    public Task updateTask(Task task){
        taskDao.save(task);
        return task;
    }

    @Override
    public void deleteTask(long parseLong) {
        Task entity = taskDao.getReferenceById(parseLong);
        taskDao.delete(entity);
    }

    
    

    
} 
