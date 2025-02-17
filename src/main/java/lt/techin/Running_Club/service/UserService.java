package lt.techin.Running_Club.service;

import lt.techin.Running_Club.model.User;
import lt.techin.Running_Club.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public User saveUser(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword())); // Encode password before saving
    return userRepository.save(user);
  }

  public Optional<User> findUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public List<User> findAllUsers() {
    return userRepository.findAll();
  }

  public boolean checkPassword(String rawPassword, String storedHash) {
    return passwordEncoder.matches(rawPassword, storedHash);
  }
}
