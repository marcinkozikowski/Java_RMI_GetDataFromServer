/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_serverint;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Person implements Serializable{
    String name;

    Person(String jan, String masakrator) {
        name=jan;
        surname=masakrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    String surname;
    
}
