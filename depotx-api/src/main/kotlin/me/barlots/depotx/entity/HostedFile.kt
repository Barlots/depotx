package me.barlots.depotx.entity

import java.util.*
import javax.persistence.*

@DiscriminatorColumn(name = "Discriminator", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
abstract class HostedFile(): DatabaseEntity() {
    var name: String = ""
    var path: String = ""
    var created: Date = Date()

    constructor(name: String, path: String) : this() {
        this.name = name
        this.path = path
    }
}