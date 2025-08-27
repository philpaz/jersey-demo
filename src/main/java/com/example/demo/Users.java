package com.example.demo;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "users")
public class Users {
    
    private ArrayList<User> users = new ArrayList<>();
 
    @XmlElement(name="user")
    public ArrayList<User> getUsers() {
        return users;
    }
 
    public void setUsers(ArrayList<User> users) {
        this.users = users != null ? users : new ArrayList<>();
    }
}
