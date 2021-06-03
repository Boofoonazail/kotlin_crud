package com.study.kotlin.service

import com.study.kotlin.controllers.UserDto
import com.study.kotlin.storage.UserRepository
import com.study.kotlin.user.User
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {


    fun addUser(userDto: UserDto) {
        val user = User(userDto.firstName, userDto.lastName);

        println("Получен новый пользователь: $user")

        userRepository.save(user)
    }

    fun <User> getUsersByName(firstName: String): List<User> {
        return userRepository.findByFirstName(firstName)
    }

    fun deleteUserById(id: String) {
        userRepository.deleteById(id)
    }

}