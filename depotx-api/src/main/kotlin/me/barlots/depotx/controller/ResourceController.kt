package me.barlots.depotx.controller

import me.barlots.depotx.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile

@Controller
class ResourceController {

    @Autowired
    lateinit var fileService: FileService

    @PostMapping("/images")
    fun uploadImage(@RequestParam file: MultipartFile): ResponseEntity<Any> {
        return ResponseEntity("${fileService.handleImage(file)}", HttpStatus.CREATED)
    }

    @PostMapping("/services")
    fun testService(@RequestParam sentence: String): ResponseEntity<Any> {
        val said = fileService.say(sentence);
        return ResponseEntity(said, HttpStatus.OK)
    }
}
