/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_serverint;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Dell
 */
public class RMI_ServerMain {
    public static void main(String[] args) {
        try {
            System.setProperty("java.security.policy", "security.policy");
            if (System.getSecurityManager() == null) {

                System.setSecurityManager(new SecurityManager());

            }
          System.setProperty("java.rmi.server.codebase", "file:/C:/Users/Dell/Documents/NetBeansProjects/RMI_ServerInt/");
          //System.setProperty("java.rmi.server.hostname", "172.20.10.6");
//           System.setProperty("java.rmi.server.codebase", "file:/C:/Users/Dell/Documents/NetBeansProjects/RMI_ServerInt/build/classes/");
//            System.setProperty("java.rmi.server.codebase","file:/C:/Users/Dell/Documents/NetBeansProjects/RMI_ServerInt/bin/");

 //           System.out.println("Codebase: " + System.getProperty("java.rmi.server.codebase"));
            LocateRegistry.createRegistry(1099);
            RMI_ServerImpl obj1 = new RMI_ServerImpl();

            Naming.rebind("//localhost/ABC", obj1);

            System.out.println("Serwer oczekuje ...");

        } catch (RemoteException | MalformedURLException e) {

            e.printStackTrace();

        }

    }

}
