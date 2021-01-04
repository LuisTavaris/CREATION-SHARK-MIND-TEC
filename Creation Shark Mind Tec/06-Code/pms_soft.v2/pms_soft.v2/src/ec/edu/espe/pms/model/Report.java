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
public class Report {
    private int stock;
    private String expeditionDate;
    private String expirationDate;

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the expeditionDate
     */
    public String getExpeditionDate() {
        return expeditionDate;
    }

    /**
     * @param expeditionDate the expeditionDate to set
     */
    public void setExpeditionDate(String expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    /**
     * @return the expirationDate
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
}
