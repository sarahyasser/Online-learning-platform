package com.example.onlinelearningplatform.entities;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin extends User{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;


    public Admin() {
        super();
    }
    public Admin(String name, String email, String password) {
        super(name, email, password);
    }


//    private String name;
//    private String email;
//    private String password;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
}
