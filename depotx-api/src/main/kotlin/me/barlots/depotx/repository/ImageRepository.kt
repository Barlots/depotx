package me.barlots.depotx.repository

import me.barlots.depotx.entity.Image
import org.springframework.data.repository.CrudRepository

interface ImageRepository: CrudRepository<Image, Long>
