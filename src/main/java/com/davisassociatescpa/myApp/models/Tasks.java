package com.davisassociatescpa.myApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tasks {

    @Id
    @GeneratedValue
    private int id;

    private String taskName;

    private String description;

    private String taskType;

}
