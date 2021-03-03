package springbootpractice.bankapp.service;

import javax.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springbootpractice.bankapp.model.Role;
import springbootpractice.bankapp.repository.RoleRepository;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleRepository.getByRoleName(Role.Roles.valueOf(roleName)).orElseThrow(
                () -> new EntityNotFoundException("Can't get role from db" + roleName));
    }
}
