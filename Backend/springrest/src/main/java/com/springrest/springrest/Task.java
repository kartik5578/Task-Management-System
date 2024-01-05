package com.springrest.springrest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
    
    @Id
    private long id;
    private String title;
    private String description;


    public Task(long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Task(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
  
    
}
