/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librarylab;

/**
 *
 * @author soblab
 */
//this is a library class, used by librarylabmain
public class Employee {
    
    public int id;
    public String name;
    public String dept;
    
    
    public String getDept(){
        return dept;
    }
    public String getName(){
        return name;
        
    }
    public int getID(){
        return id;
    }
    
    public void setName(String s){
        name = s;
    }
     public void setID(int i){
         id = i;
     }
     public void setDept(String s){
         dept = s;
     }
     
     public String toString(){
         return name + " - " + id + " - " + dept;
     }
    
    
}
