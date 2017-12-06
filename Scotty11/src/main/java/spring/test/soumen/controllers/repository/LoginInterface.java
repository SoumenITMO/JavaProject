package spring.test.soumen.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.test.soumen.controllers.model.LoginModel;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface LoginInterface extends JpaRepository<LoginModel, Long>
{
    @Query("select log.FirstName,log.LastName From LoginModel log where log.pwd_ = ?1 and log.mail_ = ?2")
    List<LoginModel> checkLogin(String password, String mail);
}
