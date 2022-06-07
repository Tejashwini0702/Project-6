package com.Spring.manytomany;
import com.manytomanyrelationship.domain.Role;
import com.manytomanyrelationship.domain.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SpringBootApplication
public class SpringmanyToManyApplication {
    static final Logger logger = LogManager.getLogger(SpringmanyToManyApplication.class);
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringmanyToManyApplication.class, args);
        logger.info("hello!!");
        SpringmanyToManyApplication usersRepository = context.getBean(SpringmanyToManyApplication.class);
        ((CrudRepository<Users, Integer>) usersRepository).save(createUserObject1());
        ((CrudRepository<Users, Integer>) usersRepository).save(createUserObject2());
    }

	private static Users createUserObject1() {
        Users user = new Users();
        user.setUsername("user1");
        user.setPassword("testPassword1");
        Role role = new Role();
        role.setName("Lab Staff");
        List<Role> roles = Collections.singletonList(role);
        user.setRoles(roles);
        return user;
    }
    private static Users createUserObject2() {
        Users user = new Users();
        user.setUsername("user2");
        user.setPassword("testPassword2");
        Role role1 = new Role();
        role1.setName("Teacher");
        Role role2 = new Role();
        role2.setName("Chairman");
        List<Role> roles = new ArrayList<>();
        roles.add(role1);
        roles.add(role2);
        user.setRoles(roles);
        return user;
    }
}