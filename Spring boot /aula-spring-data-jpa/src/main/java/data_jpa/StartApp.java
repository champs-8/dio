package data_jpa;

import data_jpa.model.User;
import data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> user = repository.filtrarPorNome("Irineu");
        for (User u: user) {
            System.out.println(u);
        }

    }
    public void insertUser() {
        User user = new User();
        user.setName("Irineu pika fina");
        user.setUsername("OtalDoIrineu");
        user.setPassword("eu");

        repository.save(user); // Save the user to the database

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
