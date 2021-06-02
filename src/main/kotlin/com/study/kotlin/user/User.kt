package com.study.kotlin.user

data class User(
    val firstName: String,
    val lastName: String
) {
    override fun toString(): String {
        return "User[firstName: $firstName, lastName: $lastName]"
    }
}