   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Attributes
    private String firstName; 
    private String lastName;
    private String userName;
    private String password;
    private String RSAcellNumber;
    
   //Constructor
    public Login(String firstName, String lastName, String userName, String password, String RSAcellNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.RSAcellNumber = RSAcellNumber;
    }
    // Getter method and Setter method
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
   public String getLastName(){
       return lastName;
   }
       
   public void setLastName(String lastName){
       this.lastName = lastName;
   }
       
   
   public String getUserName(){
       return userName;
   }
   public void setUserName(String userName){
       this.userName = userName;
   }
   

   
   public String getPassword(){
       return password;
   }
   public void setPassword(String password){
      this.password = password;
   }
   public String getRSAcellNumber(){
       return RSAcellNumber;
   }
   public void setRSAcellNumber(String RSAcellNumber){
       this.RSAcellNumber = RSAcellNumber;
   }
   //To dislpay Login details
 

    @Override
   public String toString(){
       return "Login:" + firstName + " " + lastName + " " + ",UserName " + userName + "Cell" + RSAcellNumber;
   }
  
   
    
    
}
