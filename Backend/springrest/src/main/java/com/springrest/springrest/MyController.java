package com.springrest.springrest;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class MyController  {

    @Autowired
    private TaskService taskService;


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return this.taskService.getTasks();
    } 

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/task/{taskId}")
    public Task getTask(@PathVariable String taskId ){
        return this.taskService.getTask(Long.parseLong(taskId));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/tasks")
    public Task addTask (@RequestBody Task task){
        return this.taskService.addTask(task);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task task){
        return this.taskService.updateTask(task);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/tasks/{taskId}")
    public ResponseEntity<HttpStatus> deleTask(@PathVariable String taskId){
       try{
        this.taskService.deleteTask(Long.parseLong(taskId));
        return new ResponseEntity<>(HttpStatus.OK);
       } catch(Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
    
}
