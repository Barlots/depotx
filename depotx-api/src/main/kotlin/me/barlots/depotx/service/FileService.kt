package me.barlots.depotx.service

import me.barlots.depotx.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FileService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun say(msg: String) = "Service said: $msg"
}