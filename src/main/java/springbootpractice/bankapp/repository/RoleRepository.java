package springbootpractice.bankapp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import springbootpractice.bankapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getByRoleName(Role.Roles role);
}
