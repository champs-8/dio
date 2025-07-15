package data_jpa;

import data_jpa.model.User;
import data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("CHAMPS");
        user.setUsername("champs_8");
        user.setPassword("123456");

        repository.save(user); // Save the user to the database

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
