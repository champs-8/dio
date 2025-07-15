package data_jpa.repository;

import data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    // This interface will automatically provide CRUD operations for User entities
    // No additional methods are needed unless custom queries are required
}
