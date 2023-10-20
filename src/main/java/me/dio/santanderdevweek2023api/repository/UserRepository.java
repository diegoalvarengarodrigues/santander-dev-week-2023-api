package me.dio.santanderdevweek2023api.repository;

import me.dio.santanderdevweek2023api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);
}
