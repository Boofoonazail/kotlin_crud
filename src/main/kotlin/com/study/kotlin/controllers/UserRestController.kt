package com.study.kotlin.controllers

import com.study.kotlin.service.UserService
import com.study.kotlin.user.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserRestController(
    val userService: UserService
) {

    @PostMapping("/add")
    fun addUser(
        @RequestBody user: User
    ) {
        val user = User(user.id, user.firstName, user.lastName)
        userService.addUser(user)
        println("Вызвали контроллер для создания пользователя.")
    }

}