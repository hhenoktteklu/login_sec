package com.codeworksacademymessagingapp.messagingapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int active;
    @OneToMany
    private Set<Role> roles;

    public Users() {
    }

    public Users(Users users){
        this.active = users.getActive();
        this.email = users.getEmail();
        this.roles = users.getRoles();
        this.firstName = users.getFirstName();
        this.lastName = users.getLastName();
        this.id = users.getId();
        this.password = users.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
