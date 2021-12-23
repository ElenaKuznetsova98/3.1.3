package SpringBoot.repository;


import SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserByUsername(String username);

    User findByEmail(String email);

    User getUserById(int id);

}
