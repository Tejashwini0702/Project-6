package com.manytomanyrelationship.domain;

import java.util.Collection;
import java.util.List;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String username;
String password;
@ManyToMany
@JoinTable(name = "users_roles", 
    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
private Collection<Role> roles;
public Users() {
}
public Users(String username, String password, Collection<Role> roles) {
    this.username = username;
    this.password = password;
    this.roles = roles;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
}
public static void setid(Integer id2) {
	
}
public void setRoles(List<com.manytomanyrelationship.domain.Role> roles2) {

}
}
