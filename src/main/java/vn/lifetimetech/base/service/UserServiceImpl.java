package vn.lifetimetech.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.lifetimetech.base.model.UsersEntity;
import vn.lifetimetech.base.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UsersEntity getUserById(int id) {
        return userRepository.findById(id);
    }

}
