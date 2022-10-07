package id.com.ninja.dojo.usersmanagementservice.Controller;

import id.com.ninja.dojo.usersmanagementservice.Dto.*;
import id.com.ninja.dojo.usersmanagementservice.Model.User;
import id.com.ninja.dojo.usersmanagementservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


//@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    UserService userService;
    @PostMapping("/add")

    public CreateUserResponeDto add(@RequestBody CreateUserRequestDto requestDto){
        return userService.add(requestDto);
    }
    @PostMapping("/update")

    public UpdateUserResponeDto update(@RequestBody UpdateUserRequestDto requestDto){
        return userService.update(requestDto);
    }

    @GetMapping ("/find")
    public List<User> findAll (){
        return userService.findAll();
    }
    @PostMapping("/getById{id}")
    public GetUserByIdResponeDto getById(@RequestBody GetUseByIdRequestDto requestDto){
        return userService.findById(requestDto);
    }
    @DeleteMapping("/Remove{id}")
        public String remove(@PathVariable(value="id")int id){
        userService.remove(id);
        return "sukses";
    }




}
