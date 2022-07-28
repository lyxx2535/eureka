package io.grissom.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.grissom.userservice.domain.User;

/**
 * Author: Garroshh
 * date: 2020/7/8 4:10 下午
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
