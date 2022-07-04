package com.example.truyvannangcaojpa.repository;


import com.example.truyvannangcaojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllById(Long id);

    List<User> findAllByIdBetween(int start, int end);

    @Query("SELECT u FROM User u WHERE u.age = :age")
    User findUserByAgeQuery(@Param("age") Integer age);
}
