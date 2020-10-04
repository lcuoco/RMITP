package rmi.cuoco.server.inter;

import rmi.cuoco.server.object.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IChat extends Remote {
    int firstConnexion() throws RemoteException;
    void addMessage(Message message) throws RemoteException;
    List<Message> getChat() throws RemoteException;
    Message getMessage(int position) throws RemoteException;
    void register(ICallbackListenner callbackListenner) throws RemoteException;
}
