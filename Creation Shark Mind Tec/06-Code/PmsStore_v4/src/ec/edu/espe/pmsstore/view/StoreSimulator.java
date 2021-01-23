/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pmsstore.view;

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
        int accessnum1 = 0;
        do {
            Scanner option1 = new Scanner(System.in);
            int select = option1.nextInt();

            if (select == 1) {
                System.out.println("name: ");
                Assistant assistant = new Assistant();

            } else if (select == 2) {
                int accessnum = 0;
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
                        Scanner option2 = new Scanner(System.in);
                        select = option2.nextInt();
                    } else {
                        System.out.println("the user or password is wrong");
                        accessnum++;
                        if (accessnum == 3) {
                            System.out.println("system lock");
                        }
                    }
                } while (accessnum < 3);

            } else {

                System.out.println("The option I chose does not exist");

                accessnum1++;
                if (accessnum1 == 3) {
                    System.out.println("number of attempts exceeded");

                }

            }
        } while (accessnum1 < 3);

    }

}
