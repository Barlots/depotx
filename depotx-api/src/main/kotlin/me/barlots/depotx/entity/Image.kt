package me.barlots.depotx.entity

import org.hibernate.type.ImageType
import javax.persistence.DiscriminatorValue

@DiscriminatorValue("Image")
class Image(type: ImageType, identifier: String, name: String, path: String) : HostedFile(name, path) {
    var Identifier: String = identifier
    var Type: ImageType = type
}