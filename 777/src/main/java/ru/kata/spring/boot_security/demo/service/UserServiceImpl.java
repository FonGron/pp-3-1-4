package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserRepository UR;

    public UserServiceImpl(UserRepository ur) {
        UR = ur;
    }

    @Override
    public List<User> getAllUsers() {
        return UR.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return UR.getUserById(id);
    }

    @Override
    public void deleteUser(Long id) {
        UR.deleteUser(id);
    }

    @Override
    public void addUser(User user) {
        UR.addUser(user);
    }

    @Override
    public void editUser(User user) {
        UR.editUser(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return UR.loadUserByUsername(s);
    }
}
