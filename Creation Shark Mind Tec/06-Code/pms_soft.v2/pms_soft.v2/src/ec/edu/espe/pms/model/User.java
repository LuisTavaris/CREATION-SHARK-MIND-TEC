/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pms.model;

/**
 *
 * @author DavidSC
 */
public class User {
    private String administration;
    private String owner;

    /**
     * @return the administration
     */
    public String getAdministration() {
        return administration;
    }

    /**
     * @param administration the administration to set
     */
    public void setAdministration(String administration) {
        this.administration = administration;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
}
