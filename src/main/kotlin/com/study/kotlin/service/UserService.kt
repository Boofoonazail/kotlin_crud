package com.study.kotlin.service

import com.study.kotlin.storage.UserRepository
import com.study.kotlin.user.User
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun addUser(user: User) {
        userRepository.save(user)
    }

}