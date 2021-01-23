/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

import java.util.ArrayList;

/**
 *
 * @author amandar
 */
public class Assistant {

    private String name;
    private long id;
    private int telephone;
    private String user;
    private String password;

    @Override
    public String toString() {
        return "Assistant{" + "name=" + name + ", id=" + id +
                ", telephone=" + telephone + ", user=" + user +
                ", password=" + password + '}';
    }

    public void add(Client client) {

    }

    public void remove(Client client) {

    }

    public void search(Product product) {

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
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
