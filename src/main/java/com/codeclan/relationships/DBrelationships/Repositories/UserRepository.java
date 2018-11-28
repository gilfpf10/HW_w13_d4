package com.codeclan.relationships.DBrelationships.Repositories;
import com.codeclan.relationships.DBrelationships.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
