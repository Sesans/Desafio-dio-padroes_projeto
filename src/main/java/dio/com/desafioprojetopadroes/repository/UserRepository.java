package dio.com.desafioprojetopadroes.repository;

import dio.com.desafioprojetopadroes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query
    public void findUserById(Integer id );
    @Query
    public void findUserByEmail(String email);
}
