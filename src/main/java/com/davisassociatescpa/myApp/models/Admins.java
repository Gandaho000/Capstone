package com.davisassociatescpa.myApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admins {

    @Id
    @GeneratedValue
    private int id;

    private String adminFirstName;

    private String adminLastName;

    private String adminEmailAddress;
}
