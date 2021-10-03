/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author HAWASEB
 */
 @Entity
@Table(name="Admin")
public class Admin {
    @Id
    @GeneratedValue
    private int passwod;
    private String name;

    public int getPasswod() {
        return passwod;
    }

    public void setPasswod(int passwod) {
        this.passwod = passwod;
    }
   

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
