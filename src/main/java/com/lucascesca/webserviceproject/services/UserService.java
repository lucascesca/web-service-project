package com.lucascesca.webserviceproject.services;

import com.lucascesca.webserviceproject.entities.User;
import com.lucascesca.webserviceproject.repositories.UserRepository;
import com.lucascesca.webserviceproject.services.exceptions.DatabaseException;
import com.lucascesca.webserviceproject.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
       return repository.save(user);
    }

    public void delete(Long id) {
        if (findById(id) != null) {
            try {
                repository.deleteById(id);
            } catch (DataIntegrityViolationException e) {
                throw new DatabaseException(e.getMessage());
            }
        } else {
            throw new ResourceNotFoundException(id);
        }
    }

    public User update(Long id, User user) {
        User entity = repository.getReferenceById(id);
        updateDate(entity, user);
        return repository.save(entity);
    }

    private void updateDate(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
