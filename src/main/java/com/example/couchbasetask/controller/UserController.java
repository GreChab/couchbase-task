package com.example.couchbasetask.controller;

import com.example.couchbasetask.model.Sport;
import com.example.couchbasetask.model.User;
import com.example.couchbasetask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private final UserService userService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User findUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }

    @GetMapping("/user/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public User findUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }

    @PutMapping("/user/{id}/sport")
    @ResponseStatus(HttpStatus.OK)
    public User addSport(@PathVariable String id, @RequestBody Sport sport) {
        return userService.addSport(id, sport);
    }

    @GetMapping("/user/sport/{sportName}")
    @ResponseStatus(HttpStatus.OK)
    public User findUserBySportName(@PathVariable String sportName) {
        return userService.findUserBySportName(sportName);
    }

    @GetMapping("/search/user")
    @ResponseStatus(HttpStatus.OK)
    public User findUserByQuery(@RequestParam("q") String query) {
        return userService.findUserByQuery(query);
    }
}
