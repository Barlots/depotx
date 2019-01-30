package me.barlots.depotx.repository

import me.barlots.depotx.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long>
