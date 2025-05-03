package com.eugene.controllers;

import com.eugene.dto.UserDTO;
import com.eugene.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // Constructor injection
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO){

        UserDTO registeredUser = userService.registerUser(userDTO);

        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO){

        UserDTO loggedUser = userService.loginUser(userDTO);
        
        return ResponseEntity.ok(loggedUser);
    }

    @GetMapping("/{uId}/all")
    public ResponseEntity<List<UserDTO>> getAllUsers(@PathVariable Long uId){
        
        UserDTO user = userService.getUserById(uId);

        if (!user.getRole().equals("ADMIN")) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        // Call the userService.getAllUsers() method that returns a list of users and save it in the allUsers list
        List<UserDTO> allUsers = userService.getAllUsers();

        return ResponseEntity.ok(allUsers);
    }

    // get user by specifying their id
    @GetMapping("/{uId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long uId){
        
        UserDTO user = userService.getUserById(uId);

        if (!user.getRole().equals("ADMIN")) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        return ResponseEntity.ok(user);
    
    }

    // update user
    @PutMapping("/{uId}")
    public ResponseEntity<UserDTO>updateUser(@PathVariable Long uId, @RequestBody UserDTO userDTO){

        UserDTO updatedUser = userService.updateUser(uId, userDTO);

        return ResponseEntity.ok(updatedUser);

    }

    @DeleteMapping("/{uId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long uId) {

    
        userService.deleteUser(uId);

        return ResponseEntity.noContent().build();

    }

}
