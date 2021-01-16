/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;


/**
 *
 * @author luist
 */
public class AssistantManagement {
    
    private String name;
    private long id;
    private long telephone;
    private String Address;
    private boolean active;

    
    
    
    @Override
    public String toString() {
        return "AssistantManagement{" + "name=" + name + ", id=" + 
                id + ", telephone=" + telephone + ", Address=" + 
                Address + ", active=" + active + '}';
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
    public void setId(int id) {
        this.setId(id);
    }

    /**
     * @return the telephone
     */
    public long getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.setTelephone(telephone);
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    
    
}
