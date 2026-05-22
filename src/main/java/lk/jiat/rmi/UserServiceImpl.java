package lk.jiat.rmi;

import lk.jiat.rmi.client.UserService;
import lk.jiat.rmi.model.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {

//    private final List<User> users = new ArrayList<>();
    private Map<Integer, User> users = RMIServer.users;

    public UserServiceImpl() throws RemoteException {
//        users.add(new User(1,"Kamal","kamal@gmail.com","Alawwa"));
//        users.add(new User(1,"Amal","amal@gmail.com","Colombo"));
//        users.add(new User(1,"Sunil","sunil@gmail.com","Kandy"));
//        users.add(new User(1,"Nimal","nimal@gmail.com","Anuradhapura"));
    }

    @Override
    public User getUser(int id) throws RemoteException {
        return users.get(id);
    }

    @Override
    public void addUser(Integer id,User user) throws RemoteException {
        users.put(id,user);
    }

    @Override
    public void updateUser(Integer id,User user) throws RemoteException {
        users.put(id,user);
    }

    @Override
    public void deleteUser(int id) throws RemoteException {
        users.remove(id);
    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
//        return users;
        return new ArrayList<>(users.values());
    }
}
