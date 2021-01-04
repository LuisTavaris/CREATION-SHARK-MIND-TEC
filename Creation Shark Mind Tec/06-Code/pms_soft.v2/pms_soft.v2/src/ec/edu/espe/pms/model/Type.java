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
public class Type {
private String nutritionalInformation;
private String category;

    /**
     * @return the nutritionalInformation
     */
    public String getNutritionalInformation() {
        return nutritionalInformation;
    }

    /**
     * @param nutritionalInformation the nutritionalInformation to set
     */
    public void setNutritionalInformation(String nutritionalInformation) {
        this.nutritionalInformation = nutritionalInformation;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
