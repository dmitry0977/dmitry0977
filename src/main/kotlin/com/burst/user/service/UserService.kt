package com.burst.user.service

import com.burst.user.model.User

interface UserService {
    fun findUsersList(): List<User>
    fun createUser(user: User): User
    fun findUserByEmail(email: String): User
    fun updateEmail(userId: Long, email: String?): User
    fun updatePhone(userId: Long, phone: String?): User
}