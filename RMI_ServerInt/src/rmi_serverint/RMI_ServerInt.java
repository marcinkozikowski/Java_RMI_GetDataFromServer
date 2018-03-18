/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_serverint;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public interface RMI_ServerInt extends Remote {

public int getResault(int a,int b,String operation) throws RemoteException;

public Person getPerson(int index) throws RemoteException;

public ArrayList<Person> getAllPeople() throws RemoteException;

public ArrayList<Person> getByPersonName(String name) throws RemoteException;

    
}
