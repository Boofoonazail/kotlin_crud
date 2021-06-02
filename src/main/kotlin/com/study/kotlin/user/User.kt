package com.study.kotlin.user

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "users")
data class User(

    @Id
    val id: String = UUID.randomUUID().toString(),

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String

) {

    override fun toString(): String {
        return "User[firstName: $firstName, lastName: $lastName]"
    }

}