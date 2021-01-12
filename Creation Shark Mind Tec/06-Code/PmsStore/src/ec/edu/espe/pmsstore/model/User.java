/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.model;

import java.util.Scanner;

/**
 *
 * @author luist
 */
public class User {
    
    private int select;
  
    
   
    public void choose(){
        
        System.out.println("|*****************WELCOME*******************|");
        System.out.println("|                                           |");
        System.out.println("| 1)Assistant                               |");
        System.out.println("| 2)Owner                                   |");
        System.out.println("|                                           |");
        System.out.println("|*******************************************|");
        Scanner option = new Scanner(System.in);
        select = option.nextInt();
        
        
        
        switch (select) {
            case 1 -> {
                System.out.println("name: ");
                Assistant assistant = new Assistant();
            }
            case 2 -> {
                Owner owner;
                owner = new Owner();
                System.out.println("NAME: ");
                Scanner nam = new Scanner(System.in);
                owner.name = nam.nextLine();
                System.out.println("PASSWORD: ");
                Scanner pass = new Scanner(System.in);
                owner.password = pass.nextLine();               
                Owner owner2;
                owner2 = new Owner();
                
                if((owner.getPassword().equals(owner2.getPassword())) && (owner.getName().equals(owner2.getName()))){
                    System.out.println("------------------------------------------|");
                    System.out.println("Where do you want to enter:               |");
                    System.out.println("                                          |");
                    System.out.println("1)Assistant Management                    |");
                    System.out.println("2)Costumer Management                     |");
                    System.out.println("3)Product Management                      |");
                    System.out.println("                                          |");
                    System.out.println("------------------------------------------|");
                    Scanner option2 = new Scanner(System.in);        
                    select = option2.nextInt();
                    switch(select){
                        case 1 -> {
                        
                        }
                        case 2 -> {
                        
                        }
                        case 3 -> {
                        
                        }
                        
                        default -> System.out.println("that option did not exist");
                    
                    }
                    
                    
                }else{
                    
                    System.out.println("the name or password is wrong");
                    
                }
            }
            default -> System.out.println("that option did not exist");
            
        }   
    }                              
}
