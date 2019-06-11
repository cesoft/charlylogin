package com.carlos.springbootapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {

    private long id;
    private String name;
    private String age;
    private String nickName;
    private String phones;
 
    public Contact() {
  
    }
 
    public Contact(String name, String age, String nickName, String phones) {
         this.name = name;
         this.age = age;
         this.nickName = nickName;
         this.phones = phones;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Column(name = "age", nullable = false)
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
 
    @Column(name = "nickName", nullable = false)
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    @Column(name = "phones", nullable = false)
    public String getPhones() {
        return phones;
    }
    public void setPhones(String phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", age=" + age + ", nickName=" + nickName + ", phones=" + phones
       + "]";
    }
 
}