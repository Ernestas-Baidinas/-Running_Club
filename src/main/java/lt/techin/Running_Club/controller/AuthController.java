package lt.techin.Running_Club.controller;

import lt.techin.Running_Club.dto.MessageResponse;
import lt.techin.Running_Club.dto.UserDTO;
import lt.techin.Running_Club.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO) {
    userService.register(userDTO);
    return ResponseEntity.ok(new MessageResponse("UserRegistered"));
  }
}