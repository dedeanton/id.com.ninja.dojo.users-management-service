package id.com.ninja.dojo.usersmanagementservice.Services;

import id.com.ninja.dojo.usersmanagementservice.Dto.*;
import id.com.ninja.dojo.usersmanagementservice.Model.User;
import id.com.ninja.dojo.usersmanagementservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public CreateUserResponeDto add(CreateUserRequestDto requestDto){
        User user=new User();
        user.setUserName(requestDto.getUsername());
        user.setRoleId(requestDto.getRoleId());
        user.setEmail(requestDto.getEmail());
        user.setPassword(requestDto.getPassword());
        user.setStatus(requestDto.getStatus());
        user.setCreateBy("agus");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date() );
        user.setUpdateBy("agus");
        userRepository.save(user);

        return CreateUserResponeDto.builder()

                .user(user)
                .build();
    }

    public UpdateUserResponeDto update(UpdateUserRequestDto requestDto){
        User user=new User();
        user.setId(requestDto.getId());
        user.setUserName(requestDto.getUsername());
        user.setRoleId(requestDto.getRoleId());
        user.setEmail(requestDto.getEmail());
        user.setPassword(requestDto.getPassword());
        user.setStatus(requestDto.getStatus());
        user.setCreateBy("agus");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        user.setUpdateBy("agus");
        userRepository.save(user);

        return UpdateUserResponeDto.builder()

                .user(user)
                .build();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public GetUserByIdResponeDto findById(GetUseByIdRequestDto requestDto){
        User user=userRepository.findAllById(requestDto.getId());

        return  GetUserByIdResponeDto.builder()

                .user(user)
                .build();
    }

    public  void remove (int id){
        userRepository.deleteById(id);
    }

}
