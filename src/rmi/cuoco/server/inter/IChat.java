package rmi.cuoco.server.inter;

import rmi.cuoco.server.object.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IChat extends Remote {
    void addMessage(Message message) throws RemoteException;
    List<Message> getChat() throws RemoteException;
    void notifyUsers() throws RemoteException;
}
