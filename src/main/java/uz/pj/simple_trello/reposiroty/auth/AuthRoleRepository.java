package uz.pj.simple_trello.reposiroty.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pj.simple_trello.entity.auth.AuthRole;

import java.util.Optional;

public interface AuthRoleRepository extends JpaRepository<AuthRole, Long> {
    Optional<AuthRole> getAuthRoleById(Long id);

}
