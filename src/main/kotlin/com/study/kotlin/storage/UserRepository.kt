package com.study.kotlin.storage

import com.study.kotlin.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {
    fun <User> findByFirstName(firstName: String): List<User>
}