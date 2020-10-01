package rmi.cuoco.server.impl;

import rmi.cuoco.server.inter.IHelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorld extends UnicastRemoteObject implements IHelloWorld {
    public HelloWorld() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "COUCOU";
    }
}
