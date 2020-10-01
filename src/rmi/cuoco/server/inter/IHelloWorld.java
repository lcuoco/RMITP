package rmi.cuoco.server.inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloWorld extends Remote {
    String sayHello() throws RemoteException;
}
