/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neranji Sulakshika
 */

public class LoginBean {

    private String name, password;
    
    public void setName(String name) 
    {
        this.name = name;
    }    

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    /**
     * @return the password
     */
    public String getPassword() 
    {
        return password;
    }

    public boolean validate() {
        if(password.equals("admin"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
}
