package com.koutsilis1999.blog.repositories

import com.koutsilis1999.blog.entities.User
import org.springframework.data.repository.CrudRepository


interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}