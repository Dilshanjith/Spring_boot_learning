package dila.example.firstPart.controller;

import dila.example.firstPart.dto.UserDTO;
import dila.example.firstPart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class AppController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/getuser")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/adduser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping(value = "/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateuser(userDTO);
    }
    @DeleteMapping(value = "/deleteuser")
   public String deleteuser(@RequestBody UserDTO userDTO) {
       return userService.deleteUser(userDTO);
   }


}
