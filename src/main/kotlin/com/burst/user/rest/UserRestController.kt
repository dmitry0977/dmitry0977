package com.burst.user.rest

import com.burst.user.model.User
import com.burst.user.service.UserService
import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("/users")
class UserRestController(val userService: UserService) {
    @GetMapping
    fun findUsersList() = userService.findUsersList()

    @PostMapping
    fun createUser(@RequestBody user: User) = userService.createUser(user)

    @GetMapping("/{email}")
    fun findByEmail(@PathVariable email: String) = userService.findUserByEmail(email)

    @PutMapping("/update/{userId}")
    fun update(@PathVariable userId: Long, @RequestBody user: User): User {
        return userService.updateEmail(userId, user.email)
    }
}

