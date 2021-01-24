/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.pmsstore.model.Assistant;
import ec.edu.espe.pmsstore.model.Owner;
import ec.edu.espe.pmsstore.model.Store;

import java.util.Scanner;

/**
 *
 * @author luist
 */
public class StoreSimulator {

    static public void main(String[] args) {

        Store store;
        store = new Store();
        System.out.println("enter store name: ");
        Scanner option = new Scanner(System.in);
        String name = option.nextLine();
        System.out.println("=================" + name + "===================");
        System.out.println(" ");
        System.out.println("|*****************WELCOME*******************|");
        System.out.println("|                                           |");
        System.out.println("| 1)Assistant                               |");
        System.out.println("| 2)Owner                                   |");
        System.out.println("|                                           |");
        System.out.println("|*******************************************|");
        int accessnum = 0;
        do {
            Scanner option1 = new Scanner(System.in);
            int select = option1.nextInt();

            switch (select) {
                case 1:
                    System.out.println("name: ");
                    break;
                case 2:
                    int accessnum1 = 0;
                    do {
                        Owner owner;
                        owner = new Owner();
                        System.out.println("USER: ");
                        Scanner nam = new Scanner(System.in);
                        String user = nam.nextLine();
                        System.out.println("PASSWORD: ");
                        Scanner pass = new Scanner(System.in);
                        String password = pass.nextLine();
                        owner.setUser(user);
                        owner.setPassword(password);
                        Owner owner2;
                        owner2 = new Owner();
                        if ((owner.getPassword().equals(owner2.getPassword())) && (owner.getUser().equals(owner2.getUser()))) {
                            System.out.println("------------------------------------------|");
                            System.out.println("Where do you want to enter:               |");
                            System.out.println("                                          |");
                            System.out.println("1)Assistant Management                    |");
                            System.out.println("2)Costumer Management                     |");
                            System.out.println("3)Product Management                      |");
                            System.out.println("                                          |");
                            System.out.println("------------------------------------------|");
                            int accessnum3 = 0;
                            do {
                                Scanner option2 = new Scanner(System.in);
                                int select2 = option2.nextInt();
                                switch (select2) {
                                    case 1:
                                        System.out.println("------------------------------------------|");
                                        System.out.println("                                          |");
                                        System.out.println("1)Enter a new user                        |");
                                        System.out.println("2)Show registered user                    |");
                                        System.out.println("3)Delete registered user                  |");
                                        System.out.println("                                          |");
                                        System.out.println("------------------------------------------|");
                                        int accessnum4 = 0;
                                        do {
                                            Scanner option3 = new Scanner(System.in);
                                            int select3 = option3.nextInt();
                                            
                                            switch (select3) {
                                                case 1:
                                                    boolean option4;
                                                    do {
                                                        
                                                        System.out.println("name: ");
                                                        Scanner nameass = new Scanner(System.in);
                                                        String name1 = nameass.nextLine();
                                                        System.out.println("id: ");
                                                        Scanner num = new Scanner(System.in);
                                                        long id = num.nextLong();
                                                        System.out.println("cell phone number: ");
                                                        Scanner cell = new Scanner(System.in);
                                                        int telephone = cell.nextInt();
                                                        Assistant assistant;
                                                        assistant = new Assistant(name1,id,telephone);
                                                        //library : GSON
                                                        Gson gson = new Gson();
                                                        String jsonAssistant;
                                                        
                                                        //serialization
                                                        jsonAssistant = gson.toJson(assistant);
                                                        //save
                                                        Data.save("Assistant.json", jsonAssistant + "\n");
                                                        
                                                        System.out.println("Register another true = yes false = no");
                                                        Scanner opt = new Scanner(System.in);
                                                        option4 = opt.nextBoolean();
                                                        if(option4 == false){
                                                            System.out.println("choose an option");
                                                        }
                                                    } while (option4);
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("The option I chose does not exist");
                                                    accessnum4++;
                                                    if (accessnum4 == 3) {
                                                        System.out.println("number of attempts exceeded");
                                                    }
                                                    break;
                                            }
                                        } while (accessnum4 < 3);
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("The option I chose does not exist");
                                        accessnum3++;
                                        if (accessnum3 == 3) {
                                            System.out.println("number of attempts exceeded");
                                        }   break;
                                }
                                
                            } while (accessnum3 < 3);
                            
                        } else {
                            System.out.println("the user or password is wrong");
                            accessnum1++;
                            if (accessnum1 == 3) {
                                System.out.println("system lock");
                            }
                        }
                    } while (accessnum1 < 3);
                    break;
                default:
                    System.out.println("The option I chose does not exist");
                    accessnum++;
                    if (accessnum == 3) {
                        System.out.println("number of attempts exceeded");
                        
                    }   break;
            }
        } while (accessnum < 3);

    }

}
/* 
Authors:                   SharkMindsTec
 
Reviewer:                 Group 6 (Fail Overflow) 

Execution Proyect

2. Not all the created classes are related to each other.
3. The created classes only have "getters" and "setters" but they do nothing, some do not even have constructors.
4. The first option does nothing, it only prints a message that says "name" and the program does not advance.
5. No exceptions are used to control the entry of invalid data.
6. In option 2 of the main menu, enter the username with password, display another menu, however option 2 and 3 do nothing.
7. It is not known how to finish the program.
8. Everything that the program does is done in the main class.
*/