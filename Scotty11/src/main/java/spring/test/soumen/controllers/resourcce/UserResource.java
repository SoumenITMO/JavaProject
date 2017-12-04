package spring.test.soumen.controllers.resourcce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.test.soumen.controllers.model.Users;
import spring.test.soumen.controllers.repository.UsersRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource
{
    @Autowired
    UsersRepository userRepo;

    @GetMapping(value = "/all")
    public List<Users> getAll()
    {
        return userRepo.findAll();
    }
}
