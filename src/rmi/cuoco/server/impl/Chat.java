package rmi.cuoco.server.impl;

import rmi.cuoco.server.inter.IChat;
import rmi.cuoco.server.object.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chat extends UnicastRemoteObject implements IChat {
    List<Message> messages;
    int idClients = 0;



    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Chat() throws RemoteException {
        this.messages = new ArrayList<>();
    }


    @Override
    public int firstConnexion() {
        this.idClients++;
        return this.idClients;
    }

    @Override
    public synchronized void addMessage(Message message) {
        this.messages.add(message);
    }

    @Override
    public synchronized List<Message> getChat() {
        return this.messages;
    }

    @Override
    public synchronized Message getMessage(int position) throws RemoteException {
        if(messages.size() <= position || messages.isEmpty())
        {
            return null;
        }
        else return messages.get(position);

    }


}