package dz4seminar.View;

import dz4seminar.Data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}