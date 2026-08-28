package com.example.vault_nest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vault_nest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
