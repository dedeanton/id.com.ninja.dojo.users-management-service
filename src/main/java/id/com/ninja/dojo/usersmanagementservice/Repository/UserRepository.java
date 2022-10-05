package id.com.ninja.dojo.usersmanagementservice.Repository;

import id.com.ninja.dojo.usersmanagementservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

}
