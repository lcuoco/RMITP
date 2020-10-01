package rmi.cuoco.server.impl;

import rmi.cuoco.server.inter.IChat;
import rmi.cuoco.server.object.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Chat extends UnicastRemoteObject implements IChat {
    List<Message> messages;


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
    public void addMessage(Message message) {
        this.messages.add(message);
    }

    @Override
    public List<Message> getChat() {
        return this.messages;
    }

    @Override
    public void notifyUsers() throws RemoteException {
            for (Enumeration e = messages.elements(); e.hasMoreElements();)
            { TemperatureListener listener =
                    (TemperatureListener) e.nextElement();
                try {
                    listener.temperatureChanged(temp);
                } catch(RemoteException re) {
                    System.out.println("removing listener -"+listener);
                    list.remove(listener); } } }
}
