package dila.example.firstPart.service;

import dila.example.firstPart.dto.UserDTO;
import dila.example.firstPart.model.User;
import dila.example.firstPart.repo.UserRepo;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
        List<User>userList= userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;

    }

    public UserDTO updateuser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public String deleteUser(UserDTO userDTO) {
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return "user deleted";
    }

}

