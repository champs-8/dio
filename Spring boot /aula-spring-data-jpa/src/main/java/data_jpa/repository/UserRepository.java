package data_jpa.repository;

import data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    // This interface will automatically provide CRUD operations for User entities
    // No additional methods are needed unless custom queries are required

    // Example of a custom query method
    List<User> findByNameContaining(String name);

    // Example of a custom query method
    User findByUsername(String username);

    // Example of a custom query override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name")String name);
}
