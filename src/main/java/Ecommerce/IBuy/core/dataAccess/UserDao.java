package Ecommerce.IBuy.core.dataAccess;

import Ecommerce.IBuy.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
