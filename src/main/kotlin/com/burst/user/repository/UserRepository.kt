package com.burst.user.repository

import com.burst.user.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
        fun findByEmail(email: String): User
}