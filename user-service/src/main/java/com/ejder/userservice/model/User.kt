package com.ejder.userservice.model

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id:String,
        val name:String,
        val surname:String
)
