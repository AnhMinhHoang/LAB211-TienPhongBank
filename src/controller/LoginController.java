/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.LoginRepository;
import view.Menu;

/**
 *
 * @author GoldCandy
 */
public class LoginController extends Menu{
    protected static String[] mc = {"Vietnamese", "English", "Exit"};
    protected LoginRepository repo;
    
    public LoginController(){
        super("-------Login Program-------", mc);
        repo = new LoginRepository();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:{
                repo.login("vi");
                break;
            }
            case 2:{
                repo.login("en");
                break;
            }
            case 3:{
                System.out.println("EXIT...");
                System.exit(0);
            }
            default:{
                System.out.println("Error");
            }
        }
    }
}
