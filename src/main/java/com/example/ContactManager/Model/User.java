package com.example.ContactManager.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String name;
     @Column(unique = true)
     private String email;
     private String password;
     private String role;
     private Boolean enabled;   // for admin can enable and disable the user.
     private String image_url;
     @Column(length = 500)
     private String about;

     @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
     private List <Contact> contacts=new ArrayList<>();

 public User() {
  super();
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
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

 public String getRole() {
  return role;
 }

 public void setRole(String role) {
  this.role = role;
 }

 public Boolean getEnabled() {
  return enabled;
 }

 public void setEnabled(Boolean enabled) {
  this.enabled = enabled;
 }

 public String getImage_url() {
  return image_url;
 }

 public void setImage_url(String image_url) {
  this.image_url = image_url;
 }

 public String getAbout() {
  return about;
 }

 public void setAbout(String about) {
  this.about = about;
 }

 public List<Contact> getContacts() {
  return contacts;
 }

 public void setContacts(List<Contact> contacts) {
  this.contacts = contacts;
 }
}
