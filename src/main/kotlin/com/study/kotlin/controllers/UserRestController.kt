package com.study.kotlin.controllers

import com.study.kotlin.service.UserService
import com.study.kotlin.user.User
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/users")
class UserRestController(
    val userService: UserService
) {

    @PostMapping("/add")
    fun addUser(
        @RequestBody userDto: UserDto
    ) {
        userService.addUser(userDto)
    }


    @GetMapping("/name/{firstName}")
    @ResponseBody
    fun getUsersByName(
        @PathVariable("firstName") firstName: String
    ) : List<User>
    {
        val usersList: List<User> = userService.getUsersByName(firstName)
        println("Получен пользователь: $usersList")
        return usersList
    }

    @DeleteMapping("/delete/{id}")
    fun deleteUserById(
        @PathVariable("id") id: String
    ) {
        println("Получен запрос на удаление пользователя по идентификтаору: $id")
        userService.deleteUserById(id)
    }

}