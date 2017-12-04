package spring.test.soumen.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.test.soumen.controllers.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>
{

}
