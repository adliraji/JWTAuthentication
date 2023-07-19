package com.learning.ExampleJWT.repository;

import com.learning.ExampleJWT.entity.UserAPIAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAPIAccessRepository extends JpaRepository<UserAPIAccess, Long> {
    UserAPIAccess findByUserName(String userName);
}
