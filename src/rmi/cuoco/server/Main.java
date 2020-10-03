package rmi.cuoco.server;

import rmi.cuoco.server.impl.Chat;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
        try {
            int port = 9002;
            LocateRegistry.createRegistry(port);
//            Registry registry = LocateRegistry.getRegistry();
            Chat chat = new Chat();
            Naming.rebind("//localhost:"+ port +"/chat", chat);
            System.out.println("Serveur lancé");
            System.out.println("...");
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
