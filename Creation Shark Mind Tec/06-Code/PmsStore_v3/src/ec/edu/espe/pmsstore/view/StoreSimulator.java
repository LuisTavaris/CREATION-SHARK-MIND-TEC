/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.pmsstore.model.Assistant;
import ec.edu.espe.pmsstore.model.AssistantManagement;
import ec.edu.espe.pmsstore.model.Owner;
import ec.edu.espe.pmsstore.model.Store;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class StoreSimulator {

    static public void main(String[] args) {

        String name1;
        int select;

        Store store;
        store = new Store();
        System.out.println("enter store name: ");
        Scanner option = new Scanner(System.in);
        name1 = option.nextLine();
        store.setName(name1);
        System.out.println("=================" + name1 + "===================");
        System.out.println(" ");
        System.out.println("|*****************WELCOME*******************|");
        System.out.println("|                                           |");
        System.out.println("| 1)Assistant                               |");
        System.out.println("| 2)Owner                                   |");
        System.out.println("|                                           |");
        System.out.println("|*******************************************|");
        Scanner option1 = new Scanner(System.in);
        select = option1.nextInt();

        switch (select) {
            case 1: {
                System.out.println("name: ");
                Assistant assistant = new Assistant();
            }
            case 2: {
                String name2;
                String password;
                Owner owner;
                owner = new Owner();
                System.out.println("NAME: ");
                Scanner nam = new Scanner(System.in);
                name2 = nam.nextLine();
                System.out.println("PASSWORD: ");
                Scanner pass = new Scanner(System.in);
                password = pass.nextLine();
                owner.setName(name2);
                owner.setPassword(password);
                Owner owner2;
                owner2 = new Owner();

                if ((owner.getPassword().equals(owner2.getPassword())) && (owner.getName().equals(owner2.getName()))) {
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
                    switch (select) {
                        case 1: {
                            System.out.println("------------------------------------------|");
                            System.out.println("                                          |");
                            System.out.println("1)Enter a new user                        |");
                            System.out.println("2)Show registered user                    |");
                            System.out.println("3)Delete registered user                  |");
                            System.out.println("                                          |");
                            System.out.println("------------------------------------------|");
                            Scanner option3 = new Scanner(System.in);
                            select = option3.nextInt();

                            switch (select) {

                                case 1 : {
                                    Assistant assistant;
                                    assistant = new Assistant();

                                    System.out.println("name: ");
                                    Scanner nameass = new Scanner(System.in);
                                    assistant.name = nameass.nextLine();
                                    System.out.println("id: ");
                                    Scanner num = new Scanner(System.in);
                                    assistant.id = num.nextLong();
                                    System.out.println("cell phone number: ");
                                    Scanner cell = new Scanner(System.in);
                                    assistant.telephone = cell.nextLong();

                                    //library : GSON               
                                    Gson gson = new Gson();
                                    String jsonAssistant;

                                    //serialization 
                                    jsonAssistant = gson.toJson(assistant);
                                    //save
                                    Data.save("Assistant.json", jsonAssistant+"\n");
                                    String assistant2;
                                    assistant2 = (assistant.name + "," + assistant.id + "," + assistant.telephone + "\n");
                                    Gson gson2 = new Gson();
                                    String assis = assistant2;
                                    assis = gson2.toJson(assistant2);
                                    Data.save("Assistant.csv", assistant2);

                                }

                                case 2 : {

                                }

                                case 3 : {

                                }

                                default :
                                    System.out.println("that option did not exist");

                            }

                        }
                        case 2: {

                        }
                        case 3: {

                        }

                        default:
                            System.out.println("that option did not exist");

                    }

                } else {

                    System.out.println("the name or password is wrong");

                }
            }            
        }

    }

}
