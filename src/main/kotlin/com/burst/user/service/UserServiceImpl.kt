package com.burst.user.service

import com.burst.user.model.User
import com.burst.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun findUsersList(): List<User> {
        return userRepository.findAll()
    }

    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override fun findUserByEmail(email: String): User {
        return userRepository.findByEmail(email)
    }

    override fun updateEmail(userId: Long, email: String?): User {
        return userRepository.findById(userId)
                    .map { existingUser ->
                        val updatedUser: User = existingUser
                                .copy(email = email)
                        val user = userRepository.save(updatedUser)
                        user
                    }.orElseThrow()
    }

    override fun updatePhone(userId: Long, phone: String?): User {
        return userRepository.findById(userId)
                .map { existingUser ->
                    val updatedUser: User = existingUser
                            .copy(phone = phone)
                    val user = userRepository.save(updatedUser)
                    user
                }.orElseThrow()
    }
}