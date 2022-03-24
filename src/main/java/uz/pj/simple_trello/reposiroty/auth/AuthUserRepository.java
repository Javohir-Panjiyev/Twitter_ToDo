package uz.pj.simple_trello.reposiroty.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pj.simple_trello.entity.auth.AuthUser;
import uz.pj.simple_trello.reposiroty.base.AbstractRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long>, AbstractRepository {
    Optional<AuthUser> findAuthUserByUsername(String username);

}
