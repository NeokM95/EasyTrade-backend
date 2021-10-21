package nl.easytrade.novieo.repository;

import nl.easytrade.novieo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
