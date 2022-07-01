package com.persistence;

public class User {
    //these are variables
    //they describe the 'state' of our class
    private Integer user_id;
    private String first_name;
    private String last_name;
    private String email;


    //a no args constructor
    public User(){

    }
//this is constructor to use when retrieving from the database
    public User(Integer user_id, String first_name, String last_name, String email) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }
    //this is the constructor we would use to send to the database, not including user_id
    //we will use this constructor when creating a user
    public User(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

//these are our getters and setters
    //because we have made our fields or variables private
    //we can use getters and setter to get or set the values
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        //I can add some fucntionality to check the incoming info
        //or param or depenendcy to conform
        //that it is valid before setting it
        //to the class variable
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {


        // I can add functionality to this method to ensure that this email is valid
        //before creating a user
        this.email = email;
    }
}
