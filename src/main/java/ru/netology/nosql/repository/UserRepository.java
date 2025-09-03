package ru.netology.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.netology.nosql.model.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
    List<User> findByAge(int age);
}
