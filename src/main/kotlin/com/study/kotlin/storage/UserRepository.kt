package com.study.kotlin.storage

import com.study.kotlin.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Repository
interface UserRepository: JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {
    fun <User> findByFirstName(firstName: String): List<User>

    @Transactional
    fun deleteById(id: String)
}