package com.study.kotlin.controllers

import com.study.kotlin.user.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserRestController {

    @PostMapping("/add")
    fun addUser(
        @RequestBody user: User
    ) {
        val user = User(user.firstName, user.lastName)
        println(user.toString())
        println("Вызвали контроллер для создания пользователя.")
    }

}