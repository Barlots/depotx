package me.barlots.depotx.entity

import me.barlots.depotx.enums.ImageType
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("Image")
class Image() : HostedFile() {
    var identifier: String = ""
    var type: ImageType = ImageType.FULL
}