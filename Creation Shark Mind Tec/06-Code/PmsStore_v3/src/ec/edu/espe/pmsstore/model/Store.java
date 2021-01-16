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
public class Store {
    
    private String name;

   

    @Override
    public String toString() {
        return "Store{" + "name=" + name + '}';
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
    
    
}
