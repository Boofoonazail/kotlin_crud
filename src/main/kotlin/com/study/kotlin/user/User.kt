package com.study.kotlin.user

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "users")
data class User(

    @Id
    val id: String,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String

) {

    constructor(firstName: String, lastName: String) : this(
        id = UUID.randomUUID().toString(),
        firstName,
        lastName
    )

    override fun toString(): String {
        return "User[id: $id, firstName: $firstName, lastName: $lastName]"
    }

}