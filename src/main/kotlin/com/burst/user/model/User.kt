package com.burst.user.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val userId: Long?,
        val firstName: String?,
        val lastName: String?,
        @Column(name = "email", unique = true)
        var email: String?,
        var phone: String?,
        val birthday: LocalDate?
        )
