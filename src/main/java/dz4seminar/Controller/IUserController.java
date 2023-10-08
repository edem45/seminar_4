package dz4seminar.Controller;

import dz4seminar.Data.User;

    public interface IUserController <T extends User> {
        void create(String firstName, String secondName);
    }

