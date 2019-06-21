package com.davisassociatescpa.myApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskType {

    @Id
    @GeneratedValue
    private int id;

    private String taskTypeName;

    @OneToMany
    @JoinColumn (name = "taskTypeName")
    private List<Tasks> tasks = new ArrayList<>();

    public TaskType() {}

    public TaskType(String taskTypeName) {this.taskTypeName = taskTypeName;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
