/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/*
 *
 * @author Youssouf
 */
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_Server {

    public static void main(String args[]) throws Exception {
        try {
            var bank = new Bank();
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1242);

            Naming.rebind("rmi://localhost:1242/BANK", bank);

            System.out.println("SERVER IS REady");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
};
