package com.example.couchbasetask.service;

import com.example.couchbasetask.model.Sport;
import com.example.couchbasetask.model.User;
import com.example.couchbasetask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User findUserBySportName(String sportName) {
        return userRepository.findBySportName(sportName).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User addSport(String id, Sport sport) {
        if (userRepository.findById(id).isPresent()) {
            User user = userRepository.findById(id).get();
            Sport newSport = Sport.builder()
                    .sportName(sport.getSportName())
                    .sportProficiency(sport.getSportProficiency())
                    .build();
            user.getSports().add(newSport);
            return userRepository.save(user);
        }
        throw new RuntimeException ("User not found");
    }

    public User findUserByQuery(String query) {
        return userRepository.findByQuery(query).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
