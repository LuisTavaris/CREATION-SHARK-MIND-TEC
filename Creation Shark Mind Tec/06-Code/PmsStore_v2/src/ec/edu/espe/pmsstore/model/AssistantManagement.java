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
    private int id;
    private int telephone;
    private String Address;
    private int select;
    
    public void create(){
           
       System.out.println("------------------------------------------|");                                           
       System.out.println("                                          |");                   
       System.out.println("1)Enter a new user                        |");                   
       System.out.println("2)Show registered user                    |");                    
       System.out.println("3)Delete registered user                  |");                   
       System.out.println("                                          |");                  
       System.out.println("------------------------------------------|");
       Scanner option = new Scanner(System.in);                            
       select = option.nextInt();
              
       switch(select){
                        
           case 1 -> {               
               Assistant assistant; 
               assistant = new Assistant();
               System.out.println("name: ");
               Scanner nam = new Scanner(System.in);
               assistant.name = nam.nextLine();
               System.out.println("id: ");
               Scanner num = new Scanner(System.in);
               assistant.id = num.nextInt();
               System.out.println("cell phone number: ");
               Scanner cell = new Scanner(System.in);
               assistant.telephone = cell.nextInt();
               
               //library : GSON               
               Gson gson = new Gson();        
               String jsonAssistant;
               //serialization        
               jsonAssistant = gson.toJson(assistant);
               //save
               Data.save("Assistant.csv", jsonAssistant);                       
                        
           }
                        
           case 2 -> {
                        
                        
           }
                       
           case 3 -> {
                        
                        
           }
                        
                        
           default -> System.out.println("that option did not exist");
                    
                    
       }
             
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
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
    
    
    
    
    
}
