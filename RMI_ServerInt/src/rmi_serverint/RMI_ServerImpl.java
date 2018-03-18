/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_serverint;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RMI_ServerImpl extends UnicastRemoteObject implements RMI_ServerInt{
   
   ArrayList<Person> _lista = new ArrayList<Person>();
   
    
    protected RMI_ServerImpl() throws RemoteException {
    super();
    setPeopleList(_lista);
}
    
    private void setPeopleList(ArrayList<Person> lista)
    {
        lista.add(new Person("Jan", "Dobrzyński"));
        lista.add(new Person("Agnieszka", "Kozikowska"));
        lista.add(new Person("Marek", "Skrodzki"));
        lista.add(new Person("Asia", "Pająk"));
        lista.add(new Person("Dominika", "Cekała"));
        lista.add(new Person("Andrzej", "Domaniewski"));
        lista.add(new Person("Michał", "Jurczuk"));
        lista.add(new Person("Oleg", "Powolny"));
        lista.add(new Person("Błażej", "Dobrowolny"));
        lista.add(new Person("Maciej", "Andrzejczyk"));
        lista.add(new Person("Oskar", "Kowalski"));
        lista.add(new Person("Monika", "Staniurska"));
        lista.add(new Person("Jan", "Kowalski"));
    }
    
    @Override
    public int getResault(int a, int b, String operation) throws RemoteException {
        int resault =0;
        
        switch (operation) {
            case "*":
                resault = a*b;
                     break;
            case "+":  
                resault = a+b;
                     break;
            case "-":  
                resault = a-b;
                     break;
            case "/":  
                resault = a/b;
                     break;
        }  
        return resault;
    }

    @Override
    public Person getPerson(int index) throws RemoteException {
        return _lista.get(index);
    }

    @Override
    public ArrayList<Person> getAllPeople() throws RemoteException {
        return _lista;
    }

    @Override
    public ArrayList<Person> getByPersonName(String name) throws RemoteException {
        ArrayList<Person> lista = new ArrayList<Person>();
        for(int i=0;i<_lista.size();i++)
        {
            if(_lista.get(i).name.equals(name))
            {
            lista.add(new Person(_lista.get(i).name,_lista.get(i).surname));
            }
        }
        return lista;
    }
    

    
}
