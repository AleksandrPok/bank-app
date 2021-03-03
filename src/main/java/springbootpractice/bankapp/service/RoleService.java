package springbootpractice.bankapp.service;

import springbootpractice.bankapp.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(String roleName);
}
