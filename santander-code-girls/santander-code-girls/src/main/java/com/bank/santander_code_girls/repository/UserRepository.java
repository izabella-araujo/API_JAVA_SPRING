package com.bank.santander_code_girls.repository;
import com.bank.santander_code_girls.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    Boolean existsByEmail (String email);
}
