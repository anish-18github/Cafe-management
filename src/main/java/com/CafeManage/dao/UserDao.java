package com.CafeManage.dao;

import com.CafeManage.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {

    static User findByEmailId(@Param("email") String email) {
        return null;
    }
}