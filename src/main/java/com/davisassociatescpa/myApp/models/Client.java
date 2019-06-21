package com.davisassociatescpa.myApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int id;


    private String filingStatus;


    private String firstName1;


    private String lastName1;

    private String dob1;

    private String firstName2;

    private String lastName2;

    private String dob2;


    private String clientAddress1;


    private String clientCity1;


    private String clientState1;


    private String clientZip1;

    private String clientEmail1;

    private String clientEmail2;

    private String clientPhone1;

    private String clientPhone2;

    private String clientPhone3;

    private String clientPhone4;


    private String connect1;

    private Boolean newClient1;

    private Boolean businessOwner;

    private String clientBusinessName;

    private Integer clientBusinessEstYear;

    private String clientBusinessFilingType;


    private String clientBusinessAddress1;

    private String clientBusinessCity1;

    private String clientBusinessState1;

    private String clientBusinessZip1;

    private String clientBusinessType;

    //Constructors

    public Client(String filingStatus,
                  String firstName1,
                  String lastName1,
                  String dob1,
                  String clientEmail1,
                  String clientPhone1,
                  String firstName2,
                  String lastName2,
                  String dob2,
                  String clientEmail2,
                  String clientPhone2,
                  String clientAddress1,
                  String clientCity1,
                  String clientState1,
                  String clientZip1,
                  Boolean newClient1,
                  String connect1,
                  Boolean businessOwner,
                  String clientBusinessName,
                  Integer clientBusinessEstYear,
                  String clientBusinessFilingType,
                  String clientBusinessAddress1,
                  String clientBusinessCity1,
                  String clientBusinessState1,
                  String clientBusinessZip1,
                  String clientBusinessType
                  ) {
        this.filingStatus = filingStatus;
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.dob1 = dob1;
        this.clientEmail1 = clientEmail1;
        this.clientPhone1 = clientPhone1;
        this.firstName2 = firstName2;
        this.lastName2 = lastName2;
        this.dob2 = dob2;
        this.clientEmail2 = clientEmail2;
        this.clientPhone2 = clientPhone2;
        this.clientAddress1 = clientAddress1;
        this.clientCity1 = clientCity1;
        this.clientState1 = clientState1;
        this.clientZip1 = clientZip1;
        this.newClient1 = newClient1;
        this.connect1 = connect1;
        this.businessOwner = businessOwner;
        this.clientBusinessName = clientBusinessName;
        this.clientBusinessEstYear = clientBusinessEstYear;
        this.clientBusinessFilingType = clientBusinessFilingType;
        this.clientBusinessAddress1 = clientBusinessAddress1;
        this.clientBusinessCity1 = clientBusinessCity1;
        this.clientBusinessState1 = clientBusinessState1;
        this.clientBusinessZip1 = clientBusinessZip1;
        this.clientBusinessType = clientBusinessType;

        }

    public Client()  {}

    //Getters & Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(String filingStatus) {
        this.filingStatus = filingStatus;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getDob1() {
        return dob1;
    }

    public void setDob1(String dob1) {
        this.dob1 = dob1;
    }

    public String getDob2() {
        return dob2;
    }

    public void setDob2(String dob2) {
        this.dob2 = dob2;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getClientAddress1() {
        return clientAddress1;
    }

    public void setClientAddress1(String clientAddress1) {
        this.clientAddress1 = clientAddress1;
    }

    public String getClientCity1() {
        return clientCity1;
    }

    public void setClientCity1(String clientCity1) {
        this.clientCity1 = clientCity1;
    }

    public String getClientState1() {
        return clientState1;
    }

    public void setClientState1(String clientState1) {
        this.clientState1 = clientState1;
    }

    public String getClientZip1() {
        return clientZip1;
    }

    public void setClientZip1(String clientZip1) {
        this.clientZip1 = clientZip1;
    }

    public String getClientEmail1() {
        return clientEmail1;
    }

    public void setClientEmail1(String clientEmail1) {
        this.clientEmail1 = clientEmail1;
    }

    public String getClientEmail2() {
        return clientEmail2;
    }

    public void setClientEmail2(String clientEmail2) {
        this.clientEmail2 = clientEmail2;
    }

    public String getClientPhone1() {
        return clientPhone1;
    }

    public void setClientPhone1(String clientPhone1) {
        this.clientPhone1 = clientPhone1;
    }

    public String getClientPhone2() {
        return clientPhone2;
    }

    public void setClientPhone2(String clientPhone2) {
        this.clientPhone2 = clientPhone2;
    }

    public String getClientPhone3() {
        return clientPhone3;
    }

    public void setClientPhone3(String clientPhone3) {
        this.clientPhone3 = clientPhone3;
    }

    public String getClientPhone4() {
        return clientPhone4;
    }

    public void setClientPhone4(String clientPhone4) {
        this.clientPhone4 = clientPhone4;
    }

    public String getConnect1() {
        return connect1;
    }

    public void setConnect1(String connect1) {
        this.connect1 = connect1;
    }

    public Boolean getNewClient1() {
        return newClient1;
    }

    public void setNewClient1(Boolean newClient1) {
        this.newClient1 = newClient1;
    }

    public Boolean getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(Boolean businessOwner) {
        this.businessOwner = businessOwner;
    }

    public String getClientBusinessName() {
        return clientBusinessName;
    }

    public void setClientBusinessName(String clientBusinessName) {
        this.clientBusinessName = clientBusinessName;
    }

    public Integer getClientBusinessEstYear() {
        return clientBusinessEstYear;
    }

    public void setClientBusinessEstYear(Integer clientBusinessEstYear) {
        this.clientBusinessEstYear = clientBusinessEstYear;
    }

    public String getClientBusinessFilingType() {
        return clientBusinessFilingType;
    }

    public void setClientBusinessFilingType(String clientBusinessFilingType) {
        this.clientBusinessFilingType = clientBusinessFilingType;
    }

    public String getClientBusinessAddress1() {
        return clientBusinessAddress1;
    }

    public void setClientBusinessAddress1(String clientBusinessAddress1) {
        this.clientBusinessAddress1 = clientBusinessAddress1;
    }

    public String getClientBusinessCity1() {
        return clientBusinessCity1;
    }

    public void setClientBusinessCity1(String clientBusinessCity1) {
        this.clientBusinessCity1 = clientBusinessCity1;
    }

    public String getClientBusinessState1() {
        return clientBusinessState1;
    }

    public void setClientBusinessState1(String clientBusinessState1) {
        this.clientBusinessState1 = clientBusinessState1;
    }

    public String getClientBusinessZip1() {
        return clientBusinessZip1;
    }

    public void setClientBusinessZip1(String clientBusinessZip1) {
        this.clientBusinessZip1 = clientBusinessZip1;
    }

    public String getClientBusinessType() {
        return clientBusinessType;
    }

    public void setClientBusinessType(String clientBusinessType) {
        this.clientBusinessType = clientBusinessType;
    }
}
