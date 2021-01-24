/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

import java.util.Scanner;

/**
 *
 * @author amandar
 */
public class Owner {

    private String name;
    private long id;
    private int telephone;
    private String user;
    private String password;

    public Owner() {
        this.user = "root";
        this.password = "rootpass";

    }

    @Override
    public String toString() {
        return "Owner{" + "user=" + user + ", password=" + password + '}';
    }

    public void add(Assistant assitant) {
        

    }

    public void remove(Assistant assitant) {

    }

    public void search(Assistant assitant) {

    }

    public void login(String user, String password) {

        

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
