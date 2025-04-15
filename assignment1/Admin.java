/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author RC_Student_*/

public class Admin {
    private String role;
    
    public Admin() {
        this.role = "Admin";
    }
    //Static utility method 
    public static boolean isPasswordComplex(String password){
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*")&&
                password.matches(".*[a-z].*")&&
                password.matches(".*[0-9].*")&&
                password.matches(".*[!@$%^&*()].*");
    }
    public void displayRole(){
        System.out.println("User role: " + role);
    }
 
    

}