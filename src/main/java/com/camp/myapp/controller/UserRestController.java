package com.camp.myapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.camp.myapp.model.dto.User;
import com.camp.myapp.model.service.UserService;

import java.net.URI;
import java.util.List;

//@CrossOrigin("*")
@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        User user = userService.getUser(userId);

        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/register.do")
    public ResponseEntity register(@RequestBody User user) {
        boolean result = userService.register(user);

        if (result) {
            return ResponseEntity.created(URI.create("/api/users/" + user.getUserId())).build();
        }
        return ResponseEntity.internalServerError().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity modifyUser(@PathVariable("id") String userId, @RequestBody User user) {
        userService.modifyUser(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity removeUser(@PathVariable String userId) {
        userService.removeUser(userId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/login_form.do")
    public String loginForm() {
        return "user/login";
    }
}






