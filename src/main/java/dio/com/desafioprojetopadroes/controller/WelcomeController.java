package dio.com.desafioprojetopadroes.controller;

import dio.com.desafioprojetopadroes.models.User;
import dio.com.desafioprojetopadroes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WelcomeController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public String welcome(){
        return "Welcome to my REST API";
    }

    @PostMapping("/usuarios")
    public void post(@RequestBody User user){
        repository.save(user);
    }
    @PutMapping("/usuarios")
    public void put(@RequestBody User user){
        repository.save(user);
    }
    @GetMapping("/usuarios")
    public List<User> getAll(){
        return repository.findAll();
    }
    @GetMapping("/usuario/{id}")
    public Optional<User> getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
