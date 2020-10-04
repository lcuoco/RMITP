package rmi.cuoco.server.inter;

import rmi.cuoco.server.object.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICallbackListenner extends Remote {
    void getMessage(Message message) throws RemoteException;
}
