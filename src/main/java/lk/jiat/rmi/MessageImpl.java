package lk.jiat.rmi;

import lk.jiat.rmi.client.Message;
import lk.jiat.rmi.model.Data;
import lk.jiat.rmi.model.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class MessageImpl extends UnicastRemoteObject implements Message {

    MessageImpl() throws RemoteException {}

    @Override
    public String hello() throws RemoteException{
        return "hello";
    }

    @Override
    public Data getData() throws RemoteException {
        return new Data(10,"App Version");
    }

}
