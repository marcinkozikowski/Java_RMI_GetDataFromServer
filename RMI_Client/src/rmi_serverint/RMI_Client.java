package rmi_serverint;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Scanner;


public class RMI_Client {

    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");

        System.setSecurityManager(new SecurityManager());

        try {

            RMI_ServerInt myRemoteObject;
            myRemoteObject = (RMI_ServerInt)Naming.lookup("//localhost/ABC");

            System.out.println("Wysłano do servera: ");
            
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Wporwadz pierwsza liczbę: ");
//            int a = sc.nextInt();
//            System.out.print("Wporwadz drugą liczbę: ");
//            int b = sc.nextInt();
//            System.out.print("Wporwadz operator: ");
//            String operation = sc.next();
            
            //int result = myRemoteObject.getResault(a,b,operation);
 //           Person p = (Person)myRemoteObject.getPerson();
//            System.out.println("Otrzymana z serwera odpowiedź: " + p.name +" "+p.surname);

            Scanner sc = new Scanner(System.in);
            System.out.print("\nWporwadz indeks osoby z bazy danych: ");
            int a = sc.nextInt();
            Person p = (Person)myRemoteObject.getPerson(a);
            System.out.println("\nIndeks "+a+" :"+p.name+" "+p.surname);
            
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\nWporwadz Imię w celu wyszukania osób o danym imieniu w bazie danych: ");
            String imie = sc1.nextLine();
            System.out.println("\nWprowadzono imie: "+imie);
            ArrayList<Person> listaImion = (ArrayList<Person>)myRemoteObject.getByPersonName(imie);
                        for(int i=0;i<listaImion.size();i++)
            {
                System.out.println(listaImion.get(i).name+" "+listaImion.get(i).surname);
            }
            
                        System.out.println("\nWszystkie osoby w bazie danych: \n");
            ArrayList<Person> listaWszystkich = (ArrayList<Person>)myRemoteObject.getAllPeople();
            for(int i=0;i<listaWszystkich.size();i++)
            {
                System.out.println(listaWszystkich.get(i).name+ " "+listaWszystkich.get(i).surname);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}
