package com.ergyshila.fullstack_backend.repository;

import com.ergyshila.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
