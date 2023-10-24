/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.LoginDAO;

/**
 *
 * @author GoldCandy
 */
public class LoginRepository implements ILoginRepository {
    
    @Override
    public void login(String type){
        LoginDAO.Instance().login(type);
    }
}
