package me.barlots.depotx.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "resources")
class ApplicationProperties {
    lateinit var image: ImageProperties

    class ImageProperties {
        lateinit var rootFolder: String
        lateinit var thumbnailFolder: String
    }
}