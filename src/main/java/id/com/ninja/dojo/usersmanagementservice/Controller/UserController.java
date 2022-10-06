package id.com.ninja.dojo.usersmanagementservice.Controller;

import id.com.ninja.dojo.usersmanagementservice.Model.User;
import id.com.ninja.dojo.usersmanagementservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/User")
    public ResponseEntity<List<User>> getAllUser(@RequestParam(required = false) String user) {
        try {
            List<User> User = new ArrayList<User>();


                userRepository.findAll().forEach(User::add);


            if (User.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(User, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/User/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        Optional<User> UserData = userRepository.findById(id);

        if (UserData.isPresent()) {
            return new ResponseEntity<>(UserData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/User")
    public ResponseEntity<User> createUser(@RequestBody User User) {
        try {
            User _User = userRepository
                    .save(User);
            return new ResponseEntity<>(_User, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/User/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User User) {
        Optional<User> UserData = userRepository.findById(id);

        if (UserData.isPresent()) {
            User _user = UserData.get();
            _user.setEmail(User.getEmail());
            _user.setCreateBy(User.getCreateBy());
            _user.setCreateDate(User.getCreateDate());
            _user.setUserName(User.getUserName());
            _user.setPassword(User.getPassword());
            _user.setRoleId(User.getRoleId());
            _user.setUpdateBy(User.getUpdateBy());
            _user.setUpdateDate(User.getUpdateDate());
            _user.setStatus(User.getStatus());
            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/User/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Integer id) {
        try {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/User")
    public ResponseEntity<HttpStatus> deleteAllUser() {
        try {
            userRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
