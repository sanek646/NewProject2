package com.example.NewProjekt.models.repo;

import com.example.NewProjekt.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
