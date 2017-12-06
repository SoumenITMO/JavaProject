package spring.test.soumen.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.test.soumen.controllers.model.Users;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;


public interface UsersRepository extends JpaRepository<Users, Long>
{
    /*
    //@Async
    //List<Users> showAll(@Param("user_id")Integer id__);
    //@Query("SELECT t.title FROM Users t")
    //List<Users> showAll();

    /// SELECT .... ONLY ONE RECORD
    @Modifying
    @Query("select t FROM Users t where t.id=?1")
    List<Users> findByname__(Integer id);

    @Transactional
    @Modifying
    @Query("Delete FROM Users t where t.id = ?1")
    Integer delRec(Integer id);

    /// UPDATE ....

    @Modifying
    @Transactional
    @Query("update Users u set u.address = ?1 where u.name = ?2")
    Integer setUserInfoById(String address, String name);
    */
}
