package com.example;
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void removeUser(int id) {
        repository.deleteUserById(id); // void method
    }
}
