package lk.jiat.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {

    MessageImpl() throws RemoteException {}

    @Override
    public void hello() throws RemoteException{
        System.out.println("Server: hello...");
    }
}
