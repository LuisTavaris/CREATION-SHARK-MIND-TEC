/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class Store {

    private String name;
    private ArrayList<Assistant> assistant;
    private ArrayList<Client> client;
    private Owner owner;
    private ArrayList<Product> product;
   

    @Override
    public String toString() {
        return "Store{" + "name=" + name + ", assistant="
                + assistant + ", client=" + client + ", owner="
                + owner + ", product=" + product + '}';
    }

    public Store() {

    }

    public void RegisterOwner(String name,Owner owner,String time) {
        
        System.out.println("Enter hour of register");
        Scanner hour = new Scanner(System.in);
        time = hour.nextLine();
        Gson gson = new Gson();
        String jsonRegister= "{\"Store\":root,\"Owner\":\"root\",\"time\":\"00/00/00\"}";
        
        
       
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
     * @return the assistant
     */
    public ArrayList<Assistant> getAssistant() {
        return assistant;
    }

    /**
     * @param assistant the assistant to set
     */
    public void setAssistant(ArrayList<Assistant> assistant) {
        this.assistant = assistant;
    }

    /**
     * @return the client
     */
    public ArrayList<Client> getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(ArrayList<Client> client) {
        this.client = client;
    }

    /**
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }  

    }

   


