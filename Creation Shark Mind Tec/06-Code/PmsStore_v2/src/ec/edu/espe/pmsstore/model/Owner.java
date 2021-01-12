/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

/**
 *
 * @author luist
 */
public class Owner {
    
    public String name;
    public String password;
    
    public Owner(){
        this.name = "root";
        this.password = "rootpass";                                        
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", password=" + password + '}';
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
