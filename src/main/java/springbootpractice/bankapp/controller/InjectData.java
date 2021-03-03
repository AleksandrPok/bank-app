package springbootpractice.bankapp.controller;

import java.time.LocalDate;
import java.util.Set;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import springbootpractice.bankapp.model.Role;
import springbootpractice.bankapp.model.User;
import springbootpractice.bankapp.service.RoleService;
import springbootpractice.bankapp.service.UserService;

@Component
@AllArgsConstructor
public class InjectData {
    private final RoleService roleService;
    private final UserService userService;

    @PostConstruct
    private void inject() {
        Role userRole = new Role();
        userRole.setRoleName(Role.Roles.USER);
        roleService.save(userRole);
        Role adminRole = new Role();
        adminRole.setRoleName(Role.Roles.ADMIN);
        roleService.save(adminRole);
        User admin = new User();
        admin.setName("Admin");
        admin.setDateOfBirth(LocalDate.of(1900, 1, 1));
        admin.setRoles(Set.of(adminRole, userRole));
        admin.setPassword("admin");
        admin.setPhoneNumber("0930000000");
        userService.save(admin);
    }
}
